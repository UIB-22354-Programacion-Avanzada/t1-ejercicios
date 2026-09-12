package es.uib.prgava.tema1.ejercicios;

import java.util.function.Consumer;

import es.uib.prgava.tema1.monitor.LectorResultados;

/**
 * Ejercicio 1.2.5. Misma funcionalidad que {@link InformeDiarioAcoplado}, pero con las
 * dependencias invertidas: recibe por constructor de dónde lee y a dónde escribe.
 *
 * <p>Fíjate en que el tipo declarado es {@link LectorResultados} y no
 * {@code RepositorioResultados}: este informe solo lee.
 */
public final class InformeDiario {

    public InformeDiario(LectorResultados lector, Consumer<String> salida) {
        // TODO 1.2.5
        throw new UnsupportedOperationException("TODO 1.2.5: constructor de InformeDiario");
    }

    /** Emite una línea de cabecera y una línea por servicio. */
    public void emitir() {
        // TODO 1.2.5: misma salida que InformeDiarioAcoplado, pero por el Consumer.
        throw new UnsupportedOperationException("TODO 1.2.5: InformeDiario.emitir");
    }
}
