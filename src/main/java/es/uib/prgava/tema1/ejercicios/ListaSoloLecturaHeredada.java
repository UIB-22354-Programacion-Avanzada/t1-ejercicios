package es.uib.prgava.tema1.ejercicios;

import java.util.ArrayList;

/**
 * Ejercicio 1.2.3. Esta clase <strong>ya está escrita</strong> y viola el principio de sustitución
 * de Liskov. No la corrijas: úsala para diagnosticar el problema y escribe después
 * {@link ListaSoloLectura} con composición.
 */
public final class ListaSoloLecturaHeredada extends ArrayList<String> {

    private static final long serialVersionUID = 1L;

    @Override
    public boolean add(String elemento) {
        throw new UnsupportedOperationException("esta lista es de solo lectura");
    }

    @Override
    public boolean remove(Object elemento) {
        throw new UnsupportedOperationException("esta lista es de solo lectura");
    }
}
