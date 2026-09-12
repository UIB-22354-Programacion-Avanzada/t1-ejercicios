package es.uib.prgava.tema1.monitor;

import java.nio.file.Path;

/**
 * Ejercicio 1.2.6. Notificador que añade una línea por alerta a un fichero de texto.
 *
 * <p>Formato de cada línea: instante, nombre del servicio y mensaje, separados por punto y coma.
 */
public final class NotificadorFichero implements Notificador {

    private final Path destino;

    public NotificadorFichero(Path destino) {
        this.destino = destino;
    }

    @Override
    public void notificar(Alerta alerta) {
        // TODO 1.2.6: abre el fichero en modo APPEND dentro de un try-with-resources
        // (Files.newBufferedWriter con StandardOpenOption.APPEND y CREATE) y escribe la línea.
        // Traduce la IOException a UncheckedIOException, y justifica esa decisión en un comentario.
        throw new UnsupportedOperationException("TODO 1.2.6: NotificadorFichero.notificar");
    }
}
