package es.uib.prgava.tema1.ejercicios;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Estado;
import es.uib.prgava.tema1.monitor.Resultado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.5. */
class CriteriosTest {

    private static final Duration UMBRAL = Duration.ofMillis(500);

    @Test
    void esFalloReconoceLosResultadosCaidos() {
        assertTrue(Criterios.ES_FALLO.test(Datos.fallo(Datos.WEB)));
        assertFalse(Criterios.ES_FALLO.test(Datos.ok(Datos.WEB, 100)));
    }

    @Test
    void problematicoCombinaFalloYLentitud() {
        var problematico = Criterios.problematico(UMBRAL);

        assertTrue(problematico.test(Datos.fallo(Datos.WEB)));
        assertTrue(problematico.test(Datos.lento(Datos.WEB, 900)));
        assertFalse(problematico.test(Datos.ok(Datos.WEB, 100)));
    }

    @Test
    void ordenaPorServicioYLuegoPorLatenciaDescendente() {
        List<Resultado> ordenados = Datos.historialDeEjemplo().stream()
                .filter(r -> !r.esFallo())
                .sorted(Criterios.POR_SERVICIO_Y_LATENCIA)
                .toList();

        // El primer servicio por nombre es dns:uib.es
        assertEquals(Datos.DNS, ordenados.get(0).servicio());
        // Dentro de https://www.uib.es, primero la latencia mayor
        List<Resultado> web = ordenados.stream().filter(r -> r.servicio().equals(Datos.WEB)).toList();
        assertEquals(Duration.ofMillis(300), web.get(0).latencia());
    }

    @Test
    void laEtiquetaIncluyeElNombreEnMayusculasYLaLatencia() {
        String etiqueta = Criterios.etiqueta().apply(Datos.ok(Datos.DNS, 123));

        assertTrue(etiqueta.contains("DNS:UIB.ES"), "esperaba el nombre en mayúsculas: " + etiqueta);
        assertTrue(etiqueta.contains("123"), "esperaba la latencia: " + etiqueta);
    }

    @Test
    void laSondaConstanteRespondeSiempreLoMismo() {
        var sonda = Criterios.sondaConstante(Estado.CAIDO);

        assertEquals(Estado.CAIDO, sonda.sondear(Datos.WEB).estado());
        assertEquals(Estado.CAIDO, sonda.sondear(Datos.DNS).estado());
    }
}
