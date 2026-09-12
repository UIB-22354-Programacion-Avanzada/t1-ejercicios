package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.4. */
class PuntoAccesoTest {

    @Test
    void heredaElComportamientoDeDispositivoRed() {
        var ap = new PuntoAcceso("ap-aulario", "10.0.1.20", PuntoAcceso.Banda.GHZ_5, 44);

        ap.activar();
        assertTrue(ap.isActivo());
        assertEquals("ap-aulario", ap.getNombre());
    }

    @Test
    void toStringIncluyeElNombreYElCanal() {
        var ap = new PuntoAcceso("ap-aulario", "10.0.1.20", PuntoAcceso.Banda.GHZ_5, 44);

        String texto = ap.toString();
        assertTrue(texto.contains("ap-aulario"), "debe incluir el nombre: " + texto);
        assertTrue(texto.contains("44"), "debe incluir el canal: " + texto);
    }

    @Test
    void elCanalSeValidaSegunLaBanda() {
        assertThrows(IllegalArgumentException.class,
                () -> new PuntoAcceso("ap", "10.0.1.21", PuntoAcceso.Banda.GHZ_24, 44));
        assertThrows(IllegalArgumentException.class,
                () -> new PuntoAcceso("ap", "10.0.1.21", PuntoAcceso.Banda.GHZ_5, 11));
    }

    @Test
    void cambiarCanalAplicaLaMismaValidacion() {
        var ap = new PuntoAcceso("ap", "10.0.1.21", PuntoAcceso.Banda.GHZ_24, 6);

        ap.cambiarCanal(11);
        assertEquals(11, ap.getCanal());
        assertThrows(IllegalArgumentException.class, () -> ap.cambiarCanal(44));
    }
}
