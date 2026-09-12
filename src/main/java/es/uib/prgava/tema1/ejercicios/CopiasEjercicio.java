package es.uib.prgava.tema1.ejercicios;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Ejercicio 1.3.3. PECS: <em>producer extends, consumer super</em>. */
public final class CopiasEjercicio {

    private CopiasEjercicio() { }

    /**
     * Copia al destino los elementos del origen que cumplen el filtro.
     *
     * @return cuántos elementos se copiaron
     */
    public static <T> int copiarSi(Collection<? extends T> origen,
                                   Collection<? super T> destino,
                                   Predicate<? super T> filtro) {
        throw new UnsupportedOperationException("TODO 1.3.3: copiarSi");
    }

    /**
     * Este método <strong>ya está escrito</strong>, pero sus firmas son innecesariamente
     * restrictivas: solo acepta las tres listas del mismo tipo exacto.
     *
     * <p>TODO 1.3.3: corrige las firmas aplicando PECS y anota debajo tres llamadas que antes
     * no compilaban y ahora sí. Después descomenta {@code CopiasEjercicioTest}.
     */
    public static <T> void fusionar(List<T> a, List<T> b, List<T> destino) {
        destino.addAll(a);
        destino.addAll(b);
    }
}
