package es.uib.prgava.tema1.monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Ejercicio 1.4.1. <strong>Las pruebas son el entregable.</strong>
 *
 * <p>Escribe al menos seis métodos {@code @Test}, uno por partición de equivalencia:
 * historial vacío; historial más corto que la ventana sin fallos suficientes; exactamente el
 * mínimo de fallos (valor límite); un fallo menos del mínimo (valor límite); fallos suficientes
 * pero no consecutivos; y fallos suficientes que quedan fuera de la ventana.
 *
 * <p>Usa {@code @BeforeEach} para construir la política y constantes {@code private static final}
 * para los resultados de ejemplo. Añade además un {@code @ParameterizedTest} con
 * {@code @CsvSource} para los constructores inválidos.
 *
 * <p>Cuando termines, borra el método {@code pendiente}.
 */
class FallosEnVentanaTest {

    @Test
    void pendiente() {
        fail("TODO 1.4.1: escribe aquí las pruebas de FallosEnVentana");
    }
}
