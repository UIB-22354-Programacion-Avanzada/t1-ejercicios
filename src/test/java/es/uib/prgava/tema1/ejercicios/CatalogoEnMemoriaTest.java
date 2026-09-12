package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.4. */
class CatalogoEnMemoriaTest {

    private CatalogoEnMemoria catalogo;

    @BeforeEach
    void prepararCatalogo() {
        catalogo = new CatalogoEnMemoria();
    }

    @Test
    void registraYCuenta() {
        catalogo.registrar(new FichaDispositivo("router", "10.0.0.1"));
        catalogo.registrar(new FichaDispositivo("switch", "10.0.0.2"));

        assertEquals(2, catalogo.contar());
        assertEquals(2, catalogo.listarTodos().size());
    }

    @Test
    void buscaPorNombre() {
        catalogo.registrar(new FichaDispositivo("router", "10.0.0.1"));

        assertTrue(catalogo.buscarPorNombre("router").isPresent());
        assertTrue(catalogo.buscarPorNombre("inexistente").isEmpty());
    }

    @Test
    void eliminaPorNombre() {
        catalogo.registrar(new FichaDispositivo("router", "10.0.0.1"));

        catalogo.eliminar("router");

        assertEquals(0, catalogo.contar());
    }

    @Test
    void unCatalogoSirveComoConsultaYComoAlta() {
        ConsultaDispositivos consulta = catalogo;
        AltaDispositivos alta = catalogo;

        assertNotNull(consulta);
        assertNotNull(alta);
    }
}
