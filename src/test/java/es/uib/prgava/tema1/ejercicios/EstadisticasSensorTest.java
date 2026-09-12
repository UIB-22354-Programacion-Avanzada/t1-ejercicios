package es.uib.prgava.tema1.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.1. Fíjate en que estas pruebas no crean ningún fichero. */
class EstadisticasSensorTest {

    private static final List<Double> LECTURAS = List.of(10.0, 20.0, 30.0);

    @Test
    void calculaLasCuatroMetricas() {
        var estadisticas = new EstadisticasSensor(LECTURAS);

        assertAll(
                () -> assertEquals(3, estadisticas.cuantas()),
                () -> assertEquals(20.0, estadisticas.media()),
                () -> assertEquals(30.0, estadisticas.maximo()),
                () -> assertEquals(10.0, estadisticas.minimo()));
    }

    @Test
    void lasFilasEmpiezanPorLaCabecera() {
        var filas = new EstadisticasSensor(LECTURAS).comoFilas();

        assertEquals("metrica;valor", filas.get(0));
        assertEquals(5, filas.size());
    }

    @Test
    void elExportadorSoloEscribeLoQueRecibe() throws IOException {
        Path destino = Files.createTempFile("sensores", ".csv");
        destino.toFile().deleteOnExit();

        new ExportadorCsv().escribir(destino, List.of("a;1", "b;2"));

        assertTrue(Files.readAllLines(destino).contains("a;1"));
        assertEquals(2, Files.readAllLines(destino).size());
    }
}
