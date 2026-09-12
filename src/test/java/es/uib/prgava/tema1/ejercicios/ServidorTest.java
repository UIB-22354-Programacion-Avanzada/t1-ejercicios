package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.2. */
class ServidorTest {

    private static final DireccionIpv4 IP = new DireccionIpv4(10, 0, 0, 1);

    @Test
    void unServidorNuevoEstaFueraDeServicio() {
        assertFalse(new Servidor("web", IP, 80).isEnServicio());
    }

    @Test
    void arrancarYPararCambianElEstado() {
        var servidor = new Servidor("web", IP, 80);

        servidor.arrancar();
        assertTrue(servidor.isEnServicio());
        servidor.parar();
        assertFalse(servidor.isEnServicio());
    }

    @Test
    void elConstructorSobrecargadoUsaElPuerto443() {
        var servidor = new Servidor("seguro", IP);

        assertAll(
                () -> assertEquals(443, servidor.getPuerto()),
                () -> assertEquals("seguro", servidor.getNombre()),
                () -> assertEquals(IP, servidor.getDireccion()));
    }

    @Test
    void laIgualdadDependeSoloDeDireccionYPuerto() {
        var uno = new Servidor("web", IP, 80);
        var otro = new Servidor("web-replica", IP, 80);

        assertAll(
                () -> assertEquals(uno, otro),
                () -> assertEquals(uno.hashCode(), otro.hashCode()));
    }

    @Test
    void elContadorCuentaTodosLosServidoresCreados() {
        int antes = Servidor.getServidoresCreados();

        new Servidor("uno", IP, 81);
        new Servidor("dos", IP, 82);

        assertEquals(antes + 2, Servidor.getServidoresCreados());
    }

    @Test
    void argumentosInvalidosSonRechazados() {
        assertThrows(IllegalArgumentException.class, () -> new Servidor("web", IP, 0));
        assertThrows(IllegalArgumentException.class, () -> new Servidor("web", IP, 65536));
        assertThrows(RuntimeException.class, () -> new Servidor("  ", IP, 80));
    }
}
