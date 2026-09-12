package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.Estado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicios 1.3.6 y 1.3.7. */
class InformesEjercicioTest {

    private static final List<es.uib.prgava.tema1.monitor.Resultado> HISTORIAL =
            Datos.historialDeEjemplo();

    @Test
    void recuentaLosEstadosEnElOrdenDelEnum() {
        var recuento = InformesEjercicio.recuentoGlobal(HISTORIAL);

        assertEquals(5L, recuento.get(Estado.ACTIVO));
        assertEquals(1L, recuento.get(Estado.DEGRADADO));
        assertEquals(3L, recuento.get(Estado.CAIDO));
        assertEquals(List.of(Estado.ACTIVO, Estado.DEGRADADO, Estado.CAIDO),
                List.copyOf(recuento.keySet()));
    }

    @Test
    void calculaLaLatenciaMediaExcluyendoLosFallos() {
        assertEquals(200.0, InformesEjercicio.latenciaMediaDe(HISTORIAL, Datos.WEB).orElseThrow());
        assertEquals(700.0, InformesEjercicio.latenciaMediaDe(HISTORIAL, Datos.TCP).orElseThrow());
    }

    @Test
    void latenciaMediaEstaVaciaSiNoHayComprobacionesCorrectas() {
        var soloFallos = List.of(Datos.fallo(Datos.WEB), Datos.fallo(Datos.WEB));

        assertTrue(InformesEjercicio.latenciaMediaDe(soloFallos, Datos.WEB).isEmpty());
    }

    @Test
    void seleccionaLosServiciosConSuficientesFallos() {
        assertEquals(List.of(Datos.DNS), InformesEjercicio.serviciosConAlMenos(HISTORIAL, 2));
        assertEquals(List.of(Datos.DNS, Datos.WEB),
                InformesEjercicio.serviciosConAlMenos(HISTORIAL, 1));
    }

    @Test
    void particionaPorFallo() {
        var particion = InformesEjercicio.particionPorFallo(HISTORIAL);

        assertEquals(3, particion.get(true).size());
        assertEquals(6, particion.get(false).size());
    }

    @Test
    void calculaLaDisponibilidadDeCadaServicio() {
        var disponibilidades = InformesEjercicio.disponibilidades(HISTORIAL);

        assertEquals(0.75, disponibilidades.get(Datos.WEB));
        assertEquals(1.0, disponibilidades.get(Datos.TCP));
    }

    @Test
    void resumeLasLatenciasPorServicio() {
        var estadisticas = InformesEjercicio.estadisticasLatencia(HISTORIAL);

        assertEquals(3, estadisticas.get(Datos.WEB).getCount());
        assertEquals(300, estadisticas.get(Datos.WEB).getMax());
        assertEquals(100, estadisticas.get(Datos.WEB).getMin());
    }

    @Test
    void laTablaTieneUnaLineaPorServicioYEmpiezaPorElPeor() {
        String tabla = InformesEjercicio.tabla(HISTORIAL);

        String[] lineas = tabla.split("\\R");
        assertEquals(3, lineas.length);
        assertTrue(lineas[0].contains("dns:uib.es"),
                "la primera línea debe ser la del peor servicio, y fue: " + lineas[0]);
    }
}
