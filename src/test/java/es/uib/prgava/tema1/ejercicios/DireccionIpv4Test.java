package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Ejercicio 1.4.2. <strong>Las pruebas son el entregable.</strong>
 *
 * <p>Escribe: un {@code @ParameterizedTest} con {@code @ValueSource} para textos inválidos;
 * un {@code @ParameterizedTest} con {@code @CsvSource} que compruebe {@code esPrivada} incluyendo
 * los límites 172.15.0.1, 172.16.0.1, 172.31.255.255 y 172.32.0.1; un {@code @Test} con
 * {@code assertAll} sobre toString, equals y hashCode; y un {@code @Test} con los valores límite
 * de un octeto (0, 255, −1 y 256).
 *
 * <p>Las pruebas mínimas ya escritas están en {@link DireccionIpv4BasicoTest}; no las repitas.
 * Cuando termines, borra el método {@code pendiente}.
 */
class DireccionIpv4Test {

    @Test
    void pendiente() {
        fail("TODO 1.4.2: escribe aquí las pruebas parametrizadas de DireccionIpv4");
    }
}
