package es.uib.prgava.tema1.monitor;

import java.util.Map;

/**
 * Ejercicio 1.2.7. Decorador de {@link Sonda} que cuenta cuántas veces se ha sondeado cada
 * servicio. Debe delegar siempre en la sonda interna y no alterar su resultado.
 */
public final class SondaConRegistro implements Sonda {

    private final Sonda interna;

    public SondaConRegistro(Sonda interna) {
        // TODO 1.2.7: rechaza sondas nulas.
        this.interna = interna;
    }

    @Override
    public Resultado sondear(Servicio servicio) {
        // TODO 1.2.7
        throw new UnsupportedOperationException("TODO 1.2.7: SondaConRegistro.sondear");
    }

    /** Copia inmutable de los recuentos por servicio. */
    public Map<Servicio, Integer> conteos() {
        // TODO 1.2.7
        throw new UnsupportedOperationException("TODO 1.2.7: SondaConRegistro.conteos");
    }
}
