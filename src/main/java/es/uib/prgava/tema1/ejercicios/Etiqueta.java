package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicio 1.1.3. Esta clase <strong>ya está escrita</strong>, y tiene un defecto.
 *
 * <p>Redefine {@code equals} correctamente, pero no redefine {@code hashCode}. Localiza el
 * problema con {@link DemoEtiqueta}, corrígelo y compara el resultado con un {@code record}.
 */
public final class Etiqueta {

    private final String nombre;
    private final String valor;

    public Etiqueta(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String nombre() { return nombre; }

    public String valor() { return valor; }

    @Override
    public boolean equals(Object otro) {
        return otro instanceof Etiqueta e
                && nombre.equals(e.nombre)
                && valor.equals(e.valor);
    }

    // TODO 1.1.3: falta hashCode. Añádelo con Objects.hash y vuelve a ejecutar DemoEtiqueta.

    @Override
    public String toString() {
        return nombre + "=" + valor;
    }
}
