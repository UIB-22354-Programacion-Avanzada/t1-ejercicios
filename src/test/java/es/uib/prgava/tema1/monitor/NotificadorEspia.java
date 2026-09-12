package es.uib.prgava.tema1.monitor;

import java.util.List;

/**
 * Ejercicio 1.4.3. Doble de prueba (<em>espía</em>): guarda en orden las alertas recibidas.
 */
public final class NotificadorEspia implements Notificador {

    @Override
    public void notificar(Alerta alerta) {
        // TODO 1.4.3
        throw new UnsupportedOperationException("TODO 1.4.3: NotificadorEspia.notificar");
    }

    /** Alertas recibidas, en orden, como lista inmutable. */
    public List<Alerta> alertas() {
        throw new UnsupportedOperationException("TODO 1.4.3: NotificadorEspia.alertas");
    }

    public int cuantas() {
        throw new UnsupportedOperationException("TODO 1.4.3: NotificadorEspia.cuantas");
    }
}
