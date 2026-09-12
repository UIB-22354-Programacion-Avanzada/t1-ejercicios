package es.uib.prgava.tema1.ejercicios;

import java.nio.file.Path;
import java.time.Duration;
import java.util.Map;

/** Ejercicio 1.1.6. Lector del fichero de umbrales de latencia por servicio. */
public final class LectorUmbrales {

    private LectorUmbrales() { }

    /**
     * Lee un fichero de líneas {@code nombreServicio=milisegundos}.
     *
     * <p>Ignora líneas vacías y comentarios ({@code #}). Devuelve un mapa inmutable.
     *
     * @throws UmbralInvalidoException si una línea es inválida, el valor no es positivo
     *                                 o una clave está repetida
     */
    public static Map<String, Duration> leer(Path fichero) {
        // TODO 1.1.6: usa Files.lines dentro de un try-with-resources y encadena las causas.
        throw new UnsupportedOperationException("TODO 1.1.6: LectorUmbrales.leer");
    }

    public static void main(String[] args) {
        // TODO 1.1.6: lee umbrales-con-error.txt, deja escapar la excepción y copia aquí,
        // en un comentario, el stack trace señalando la línea de tu código y la de la causa.
        throw new UnsupportedOperationException("TODO 1.1.6: LectorUmbrales.main");
    }
}
