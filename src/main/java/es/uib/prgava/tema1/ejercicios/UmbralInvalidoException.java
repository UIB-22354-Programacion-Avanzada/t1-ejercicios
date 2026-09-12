package es.uib.prgava.tema1.ejercicios;

/** Ejercicio 1.1.6. Error al interpretar el fichero de umbrales. */
public class UmbralInvalidoException extends RuntimeException {

    private final int linea;

    public UmbralInvalidoException(int linea, String mensaje) {
        // TODO 1.1.6: el mensaje debe empezar por "Línea N: ".
        super(mensaje);
        this.linea = linea;
    }

    public UmbralInvalidoException(int linea, String mensaje, Throwable causa) {
        // TODO 1.1.6: igual que el anterior, pero encadenando la causa.
        super(mensaje, causa);
        this.linea = linea;
    }

    public int linea() {
        return linea;
    }
}
