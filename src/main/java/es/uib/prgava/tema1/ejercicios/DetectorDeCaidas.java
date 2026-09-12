package es.uib.prgava.tema1.ejercicios;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import es.uib.prgava.tema1.monitor.Resultado;
import es.uib.prgava.tema1.monitor.Servicio;
import es.uib.prgava.tema1.monitor.Sonda;
import es.uib.prgava.tema1.monitor.SondaSimulada;

/**
 * Ejercicio 1.4.5. Esta clase <strong>ya está escrita</strong> y es correcta, pero es imposible
 * de probar: llama a {@code Instant.now()} dentro de sus métodos y se fabrica su propia sonda
 * con una semilla aleatoria.
 *
 * <p>Refactorízala <em>en este mismo fichero</em>: inyecta por constructor un
 * {@link java.time.Clock} y una {@link Sonda}, y sustituye {@code Instant.now()} por
 * {@code Instant.now(reloj)}. Después escribe {@code DetectorDeCaidasTest}.
 */
public final class DetectorDeCaidas {

    private final Sonda sonda = new SondaSimulada(System.nanoTime(), 0.30, Duration.ofMillis(300));
    private final Map<Servicio, Instant> primerFallo = new HashMap<>();
    private final Duration umbral;

    public DetectorDeCaidas(Duration umbral) {
        this.umbral = umbral;
    }

    /**
     * Comprueba el servicio y devuelve {@code true} si lleva caído al menos el umbral.
     *
     * <p>Un servicio que responde deja de estar en seguimiento.
     */
    public boolean estaCaido(Servicio servicio) {
        Resultado resultado = sonda.sondear(servicio);
        if (!resultado.esFallo()) {
            primerFallo.remove(servicio);
            return false;
        }
        primerFallo.putIfAbsent(servicio, Instant.now());
        Duration caido = Duration.between(primerFallo.get(servicio), Instant.now());
        return caido.compareTo(umbral) >= 0;
    }
}
