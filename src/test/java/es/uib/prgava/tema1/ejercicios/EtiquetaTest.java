package es.uib.prgava.tema1.ejercicios;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.3. Estas pruebas fallan hasta que Etiqueta redefine hashCode. */
class EtiquetaTest {

    @Test
    void dosEtiquetasIgualesTienenElMismoCodigoHash() {
        assertEquals(new Etiqueta("entorno", "produccion").hashCode(),
                     new Etiqueta("entorno", "produccion").hashCode());
    }

    @Test
    void unConjuntoEncuentraUnaEtiquetaIgual() {
        var conjunto = new HashSet<Etiqueta>();
        conjunto.add(new Etiqueta("entorno", "produccion"));

        assertTrue(conjunto.contains(new Etiqueta("entorno", "produccion")));
    }

    @Test
    void unConjuntoNoAdmiteEtiquetasDuplicadas() {
        var conjunto = new HashSet<Etiqueta>();

        conjunto.add(new Etiqueta("zona", "aulario"));
        conjunto.add(new Etiqueta("zona", "aulario"));

        assertEquals(1, conjunto.size());
    }

    @Test
    void unMapaRecuperaElValorConUnaClaveIgual() {
        var mapa = new HashMap<Etiqueta, String>();
        mapa.put(new Etiqueta("zona", "aulario"), "edificio A");

        assertEquals("edificio A", mapa.get(new Etiqueta("zona", "aulario")));
    }
}
