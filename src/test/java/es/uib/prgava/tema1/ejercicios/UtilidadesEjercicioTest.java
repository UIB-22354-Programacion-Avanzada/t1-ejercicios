package es.uib.prgava.tema1.ejercicios;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.2. */
class UtilidadesEjercicioTest {

    @Test
    void minimoFuncionaConVariosTipos() {
        assertEquals(1, UtilidadesEjercicio.minimo(List.of(3, 1, 2)).orElseThrow());
        assertEquals("a", UtilidadesEjercicio.minimo(List.of("c", "a", "b")).orElseThrow());
        assertEquals(Duration.ofMillis(10),
                UtilidadesEjercicio.minimo(List.of(Duration.ofMillis(50), Duration.ofMillis(10)))
                        .orElseThrow());
    }

    @Test
    void minimoDeUnaColeccionVaciaEstaVacio() {
        assertTrue(UtilidadesEjercicio.minimo(List.<Integer>of()).isEmpty());
    }

    @Test
    void contarSiAplicaElCriterio() {
        assertEquals(2, UtilidadesEjercicio.contarSi(List.of(1, 2, 3, 4), n -> n % 2 == 0));
    }

    @Test
    void ordenadoDescendenteDevuelveUnaListaNuevaEInmutable() {
        var original = List.of(1, 3, 2);

        var ordenada = UtilidadesEjercicio.ordenadoDescendente(original);

        assertEquals(List.of(3, 2, 1), ordenada);
        assertEquals(List.of(1, 3, 2), original);
    }
}
