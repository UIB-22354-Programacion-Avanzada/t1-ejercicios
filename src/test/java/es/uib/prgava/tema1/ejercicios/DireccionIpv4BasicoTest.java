package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ejercicio 1.1.1. Pruebas mínimas de la dirección IPv4.
 *
 * <p>Las pruebas exhaustivas, con casos límite y pruebas parametrizadas, son el ejercicio 1.4.2.
 */
class DireccionIpv4BasicoTest {

    @Test
    void desdeInterpretaLosCuatroOctetos() {
        assertEquals(new DireccionIpv4(192, 168, 1, 1), DireccionIpv4.desde("192.168.1.1"));
    }

    @Test
    void toStringDevuelveLaFormaHabitual() {
        assertEquals("10.0.0.1", new DireccionIpv4(10, 0, 0, 1).toString());
    }

    @Test
    void octetoFueraDeRangoEsRechazado() {
        var error = assertThrows(IllegalArgumentException.class,
                () -> new DireccionIpv4(1, 2, 3, 256));
        assertEquals("Octeto fuera de rango: 256", error.getMessage());
    }

    @Test
    void reconoceLosRangosPrivados() {
        assertTrue(DireccionIpv4.desde("10.1.2.3").esPrivada());
        assertTrue(DireccionIpv4.desde("192.168.0.1").esPrivada());
        assertFalse(DireccionIpv4.desde("8.8.8.8").esPrivada());
    }
}
