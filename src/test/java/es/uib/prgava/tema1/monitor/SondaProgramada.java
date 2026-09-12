package es.uib.prgava.tema1.monitor;

import java.util.List;
import java.util.Map;

/**
 * Ejercicio 1.4.3. Doble de prueba (<em>stub</em>): devuelve, para cada servicio, los estados de
 * su lista en orden, y repite el último cuando se agota.
 *
 * <p>Vive en {@code src/test/java} porque solo sirve para probar: no forma parte del programa.
 */
public final class SondaProgramada implements Sonda {

    public SondaProgramada(Map<Servicio, List<Estado>> programa) {
        // TODO 1.4.3
        throw new UnsupportedOperationException("TODO 1.4.3: constructor de SondaProgramada");
    }

    @Override
    public Resultado sondear(Servicio servicio) {
        // TODO 1.4.3: consume el siguiente estado programado para ese servicio.
        throw new UnsupportedOperationException("TODO 1.4.3: SondaProgramada.sondear");
    }
}
