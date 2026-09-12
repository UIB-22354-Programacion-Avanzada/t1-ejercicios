package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.PuertoTcp;
import es.uib.prgava.tema1.monitor.Servicio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.4. */
class TestigoDeTipoTest {

    @Test
    void extraeSoloLosElementosDelTipoPedido() {
        List<Servicio> servicios = List.of(Datos.WEB, Datos.DNS, Datos.TCP);

        List<PuertoTcp> puertos = TestigoDeTipo.filtrarPorTipo(servicios, PuertoTcp.class);

        assertEquals(1, puertos.size());
        assertEquals(25, puertos.get(0).puerto());
    }

    @Test
    void unaListaSinElementosDelTipoDevuelveVacio() {
        List<Servicio> servicios = List.of(Datos.WEB, Datos.DNS);

        assertTrue(TestigoDeTipo.filtrarPorTipo(servicios, PuertoTcp.class).isEmpty());
    }

    @Test
    void funcionaConListasHeterogeneas() {
        List<Object> mezcla = List.of("uno", 2, Datos.WEB, 4.0);

        assertEquals(List.of("uno"), TestigoDeTipo.filtrarPorTipo(mezcla, String.class));
    }
}
