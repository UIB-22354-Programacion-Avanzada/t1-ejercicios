// PoliticaDeAlerta.java (con combinadores)
package es.uib.prgava.tema1.monitor;

import java.util.List;

@FunctionalInterface
public interface PoliticaDeAlerta {
    boolean debeAlertar(List<Resultado> historial);

    /**
     * Ejercicio 1.2.8. Crea una política a partir de su descripción textual:
     * {@code simple}, {@code consecutivos:N}, {@code ventana:K:N} o {@code latencia:MS:N}.
     *
     * @throws IllegalArgumentException si el texto no describe una política válida
     */
    static PoliticaDeAlerta desde(String texto) {
        // TODO 1.2.8: interpreta el texto y devuelve la política correspondiente.
        throw new UnsupportedOperationException("TODO 1.2.8: PoliticaDeAlerta.desde");
    }

    default PoliticaDeAlerta o(PoliticaDeAlerta otra) {
        return h -> this.debeAlertar(h) || otra.debeAlertar(h);
    }

    default PoliticaDeAlerta y(PoliticaDeAlerta otra) {
        return h -> this.debeAlertar(h) && otra.debeAlertar(h);
    }
}
