package es.uib.prgava.tema1.ejercicios;

import java.util.List;

/** Ejercicio 1.3.4. Recuperar en ejecución el tipo que el borrado elimina. */
public final class TestigoDeTipo {

    private TestigoDeTipo() { }

    /**
     * Elementos de la lista que son del tipo indicado.
     *
     * <p>Debe usar {@code tipo.isInstance} y {@code tipo.cast}: sin avisos del compilador y sin
     * ningún <em>cast</em> con paréntesis.
     */
    public static <T> List<T> filtrarPorTipo(List<?> lista, Class<T> tipo) {
        throw new UnsupportedOperationException("TODO 1.3.4: filtrarPorTipo");
    }

    // TODO 1.3.4: explica aquí por qué filtrarPorTipo(lista, List.class) no puede devolver
    // una List<List<String>> comprobada.
}
