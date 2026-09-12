package es.uib.prgava.tema1.ejercicios;

import java.time.Duration;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

import es.uib.prgava.tema1.monitor.Estado;
import es.uib.prgava.tema1.monitor.Resultado;
import es.uib.prgava.tema1.monitor.Sonda;

/**
 * Ejercicio 1.3.5. Comportamiento construido componiendo funciones.
 *
 * <p>Ninguno de los métodos de esta clase debe contener un {@code if}.
 */
public final class Criterios {

    private Criterios() { }

    /** TODO 1.3.5: sustituye la lambda por la implementación real. */
    public static final Predicate<Resultado> ES_FALLO =
            resultado -> { throw new UnsupportedOperationException("TODO 1.3.5: ES_FALLO"); };

    /**
     * Ordena por nombre de servicio ascendente y, a igualdad, por latencia descendente.
     *
     * <p>TODO 1.3.5: constrúyelo con Comparator.comparing, thenComparing y reverseOrder.
     */
    public static final Comparator<Resultado> POR_SERVICIO_Y_LATENCIA =
            (uno, otro) -> { throw new UnsupportedOperationException("TODO 1.3.5: POR_SERVICIO_Y_LATENCIA"); };

    public static Predicate<Resultado> masLentoQue(Duration umbral) {
        throw new UnsupportedOperationException("TODO 1.3.5: masLentoQue");
    }

    /** Debe definirse componiendo ES_FALLO y masLentoQue con or. */
    public static Predicate<Resultado> problematico(Duration umbral) {
        throw new UnsupportedOperationException("TODO 1.3.5: problematico");
    }

    /** Produce textos como {@code DNS:UIB.ES (123 ms)}, componiendo dos funciones con andThen. */
    public static Function<Resultado, String> etiqueta() {
        throw new UnsupportedOperationException("TODO 1.3.5: etiqueta");
    }

    /** Devuelve una lambda que implementa Sonda y responde siempre con ese estado. */
    public static Sonda sondaConstante(Estado estado) {
        throw new UnsupportedOperationException("TODO 1.3.5: sondaConstante");
    }
}
