package es.uib.prgava.tema1.ejercicios;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/** Ejercicio 1.3.2. Métodos genéricos con cotas y comodines. */
public final class UtilidadesEjercicio {

    private UtilidadesEjercicio() { }

    public static <T extends Comparable<? super T>> Optional<T> minimo(Collection<? extends T> elementos) {
        throw new UnsupportedOperationException("TODO 1.3.2: minimo");
    }

    public static <T> long contarSi(Collection<? extends T> elementos, Predicate<? super T> criterio) {
        throw new UnsupportedOperationException("TODO 1.3.2: contarSi");
    }

    /** Lista nueva e inmutable, de mayor a menor. */
    public static <T extends Comparable<? super T>> List<T> ordenadoDescendente(Collection<? extends T> elementos) {
        throw new UnsupportedOperationException("TODO 1.3.2: ordenadoDescendente");
    }

    // TODO 1.3.2: responde aquí, con una frase cada uno:
    //   (a) por qué la cota es Comparable<? super T> y no Comparable<T>;
    //   (b) por qué el parámetro es Collection<? extends T> y no Collection<T>;
    //   (c) qué error aparecería si intentaras hacer elementos.add(...) dentro de minimo.
}
