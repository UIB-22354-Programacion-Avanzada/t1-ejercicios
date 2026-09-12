package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.RepositorioEnMemoria;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.9. */
class ConfiguracionInformeTest {

    @Test
    void elBuilderAplicaLosValoresPorDefecto() {
        var configuracion = ConfiguracionInforme.builder().build();

        assertAll(
                () -> assertEquals("Informe de disponibilidad", configuracion.titulo()),
                () -> assertEquals(10, configuracion.maximoServicios()),
                () -> assertTrue(configuracion.incluirLatencias()),
                () -> assertEquals(false, configuracion.soloConFallos()));
    }

    @Test
    void elBuilderRespetaLoIndicado() {
        var configuracion = ConfiguracionInforme.builder()
                .titulo("Informe semanal")
                .maximoServicios(3)
                .soloConFallos(true)
                .build();

        assertAll(
                () -> assertEquals("Informe semanal", configuracion.titulo()),
                () -> assertEquals(3, configuracion.maximoServicios()),
                () -> assertTrue(configuracion.soloConFallos()));
    }

    @Test
    void laValidacionEstaEnElConstructorDelRecord() {
        assertThrows(IllegalArgumentException.class,
                () -> new ConfiguracionInforme("  ", 5, true, false));
        assertThrows(IllegalArgumentException.class,
                () -> new ConfiguracionInforme("titulo", 0, true, false));
    }

    @Test
    void peorServicioEstaVacioSinDatos() {
        var informe = new InformeResumen(new RepositorioEnMemoria(),
                ConfiguracionInforme.builder().build());

        assertTrue(informe.peorServicio().isEmpty());
    }

    @Test
    void peorServicioEsElDeMenorDisponibilidad() {
        var repositorio = new RepositorioEnMemoria();
        Datos.historialDeEjemplo().forEach(repositorio::guardar);

        var informe = new InformeResumen(repositorio, ConfiguracionInforme.builder().build());

        assertEquals(Datos.DNS, informe.peorServicio().orElseThrow());
    }
}
