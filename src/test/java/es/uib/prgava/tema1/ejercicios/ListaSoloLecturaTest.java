package es.uib.prgava.tema1.ejercicios;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.3. */
class ListaSoloLecturaTest {

    @Test
    void laVersionHeredadaRompeElContratoDeList() {
        List<String> lista = new ListaSoloLecturaHeredada();

        // Este es el problema: un método escrito contra List deja de funcionar.
        assertThrows(UnsupportedOperationException.class, () -> lista.add("uno"));
    }

    @Test
    void ofreceLectura() {
        var lista = new ListaSoloLectura(List.of("uno", "dos"));

        assertEquals(2, lista.tamano());
        assertEquals("dos", lista.obtener(1));
        assertTrue(lista.contiene("uno"));
        assertFalse(lista.contiene("tres"));
    }

    @Test
    void esIterable() {
        var lista = new ListaSoloLectura(List.of("uno", "dos"));

        int cuantos = 0;
        for (String elemento : lista) {
            assertFalse(elemento.isBlank());
            cuantos++;
        }
        assertEquals(2, cuantos);
    }

    @Test
    void copiaDefensivamenteLaListaRecibida() {
        var original = new ArrayList<>(List.of("uno"));
        var lista = new ListaSoloLectura(original);

        original.add("dos");

        assertEquals(1, lista.tamano());
    }
}
