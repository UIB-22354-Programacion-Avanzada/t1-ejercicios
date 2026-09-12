package es.uib.prgava.tema1.ejercicios;

import java.util.Iterator;
import java.util.List;

/**
 * Ejercicio 1.2.3. Lista de solo lectura construida con <strong>composición</strong>: envuelve
 * una lista recibida por constructor y expone únicamente operaciones de lectura.
 */
public final class ListaSoloLectura implements Iterable<String> {

    public ListaSoloLectura(List<String> elementos) {
        // TODO 1.2.3: guarda una copia defensiva.
        throw new UnsupportedOperationException("TODO 1.2.3: constructor de ListaSoloLectura");
    }

    public String obtener(int indice) {
        throw new UnsupportedOperationException("TODO 1.2.3: ListaSoloLectura.obtener");
    }

    public int tamano() {
        throw new UnsupportedOperationException("TODO 1.2.3: ListaSoloLectura.tamano");
    }

    public boolean contiene(Object elemento) {
        throw new UnsupportedOperationException("TODO 1.2.3: ListaSoloLectura.contiene");
    }

    @Override
    public Iterator<String> iterator() {
        throw new UnsupportedOperationException("TODO 1.2.3: ListaSoloLectura.iterator");
    }
}
