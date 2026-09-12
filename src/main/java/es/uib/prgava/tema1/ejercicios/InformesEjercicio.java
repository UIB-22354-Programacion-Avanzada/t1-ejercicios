package es.uib.prgava.tema1.ejercicios;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.OptionalDouble;

import es.uib.prgava.tema1.monitor.Estado;
import es.uib.prgava.tema1.monitor.LectorResultados;
import es.uib.prgava.tema1.monitor.Resultado;
import es.uib.prgava.tema1.monitor.Servicio;

/**
 * Ejercicios 1.3.6, 1.3.7 y 1.3.8. Informes sobre el historial del monitor.
 *
 * <p>Salvo donde el enunciado lo autoriza expresamente (1.3.8), <strong>no se admiten bucles</strong>.
 */
public final class InformesEjercicio {

    private InformesEjercicio() { }

    // ---------- 1.3.6 ----------

    /** Cuántos resultados hay de cada estado. El mapa se itera en el orden del enum. */
    public static Map<Estado, Long> recuentoGlobal(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.6: recuentoGlobal");
    }

    /** Latencia media en milisegundos de un servicio, excluyendo los fallos. */
    public static OptionalDouble latenciaMediaDe(List<Resultado> historial, Servicio servicio) {
        throw new UnsupportedOperationException("TODO 1.3.6: latenciaMediaDe");
    }

    /** Servicios con al menos ese número de fallos, de más a menos fallos y, a igualdad, por nombre. */
    public static List<Servicio> serviciosConAlMenos(List<Resultado> historial, int minimoFallos) {
        throw new UnsupportedOperationException("TODO 1.3.6: serviciosConAlMenos");
    }

    // ---------- 1.3.7 ----------

    /** Con partitioningBy. La clave true agrupa los fallos. */
    public static Map<Boolean, List<Resultado>> particionPorFallo(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.7: particionPorFallo");
    }

    /** Fracción de comprobaciones correctas por servicio, en [0, 1]. Con groupingBy. */
    public static Map<Servicio, Double> disponibilidades(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.7: disponibilidades");
    }

    /** Estadísticas de latencia por servicio, excluyendo los fallos. */
    public static Map<Servicio, LongSummaryStatistics> estadisticasLatencia(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.7: estadisticasLatencia");
    }

    /**
     * Una línea por servicio, de peor a mejor disponibilidad, construida con joining y
     * String.format. Usa {@code Locale.of("es", "ES")} para que el separador decimal sea la coma.
     */
    public static String tabla(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.7: tabla");
    }

    // ---------- 1.3.8 ----------

    /** Todos los resultados de todos los servicios, ordenados por instante. Con flatMap. */
    public static List<Resultado> todos(LectorResultados lector) {
        throw new UnsupportedOperationException("TODO 1.3.8: todos");
    }

    /** Mayor número de fallos consecutivos. Impleméntalo con un bucle. */
    public static int rachaMaximaDeFallos(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.8: rachaMaximaDeFallos");
    }

    /** La misma función con reduce o con un colector. Consérvala aunque quede peor. */
    public static int rachaMaximaConReduce(List<Resultado> historial) {
        throw new UnsupportedOperationException("TODO 1.3.8: rachaMaximaConReduce");
    }

    // TODO 1.3.8: compara aquí las dos versiones en cinco líneas y justifica cuál pondrías
    // en producción.
}
