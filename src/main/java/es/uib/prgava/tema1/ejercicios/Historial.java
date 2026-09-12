package es.uib.prgava.tema1.ejercicios;

import java.util.List;

/**
 * Ejercicio 1.3.1. Colección genérica que conserva como máximo los últimos {@code capacidad}
 * elementos añadidos. Usa un {@code ArrayDeque<T>} como almacén interno.
 */
public final class Historial<T> {

    public Historial(int capacidad) {
        // TODO 1.3.1: rechaza capacidades menores que 1.
        throw new UnsupportedOperationException("TODO 1.3.1: constructor de Historial");
    }

    /** Si el historial está lleno, descarta el más antiguo antes de añadir. */
    public void anadir(T elemento) {
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.anadir");
    }

    /**
     * Como máximo los {@code n} elementos más recientes, del más reciente al más antiguo,
     * en una lista inmutable.
     */
    public List<T> ultimos(int n) {
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.ultimos");
    }

    public int tamano() {
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.tamano");
    }

    public boolean vacio() {
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.vacio");
    }

    public boolean lleno() {
        throw new UnsupportedOperationException("TODO 1.3.1: Historial.lleno");
    }

    // TODO 1.3.1: explica aquí por qué ultimos devuelve List.copyOf y qué podría ocurrir
    // si devolviera directamente la colección interna.
}
