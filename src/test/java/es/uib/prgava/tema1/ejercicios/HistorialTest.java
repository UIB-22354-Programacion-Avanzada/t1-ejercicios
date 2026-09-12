package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.1. */
class HistorialTest {

    @Test
    void unHistorialNuevoEstaVacio() {
        var historial = new Historial<String>(3);

        assertTrue(historial.vacio());
        assertFalse(historial.lleno());
        assertEquals(0, historial.tamano());
    }

    @Test
    void descartaElMasAntiguoAlSuperarLaCapacidad() {
        var historial = new Historial<String>(3);

        historial.anadir("a");
        historial.anadir("b");
        historial.anadir("c");
        historial.anadir("d");

        assertEquals(3, historial.tamano());
        assertEquals(List.of("d", "c", "b"), historial.ultimos(3));
    }

    @Test
    void ultimosDevuelveDelMasRecienteAlMasAntiguo() {
        var historial = new Historial<Integer>(5);
        historial.anadir(1);
        historial.anadir(2);
        historial.anadir(3);

        assertEquals(List.of(3, 2), historial.ultimos(2));
    }

    @Test
    void ultimosNuncaDevuelveMasDeLosQueHay() {
        var historial = new Historial<Integer>(5);
        historial.anadir(1);

        assertEquals(List.of(1), historial.ultimos(10));
    }

    @Test
    void laListaDevueltaEsInmutable() {
        var historial = new Historial<String>(2);
        historial.anadir("a");

        assertThrows(UnsupportedOperationException.class, () -> historial.ultimos(1).add("b"));
    }

    @Test
    void laCapacidadDebeSerPositiva() {
        assertThrows(IllegalArgumentException.class, () -> new Historial<String>(0));
    }
}
