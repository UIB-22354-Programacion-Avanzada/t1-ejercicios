package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Ejercicio 1.4.5. <strong>Las pruebas son el entregable</strong>, y solo podrás escribirlas
 * después de refactorizar {@link DetectorDeCaidas} para que reciba un {@code Clock} y una
 * {@code Sonda} por constructor.
 *
 * <p>Con {@code Clock.fixed(...)} y {@code SondaProgramada}, comprueba de forma completamente
 * determinista que: un servicio que responde no se marca como caído; un servicio caído menos
 * tiempo del umbral no se marca (valor límite); y un servicio caído exactamente el umbral sí se
 * marca (valor límite).
 *
 * <p>Cuando termines, borra el método {@code pendiente}.
 */
class DetectorDeCaidasTest {

    @Test
    void pendiente() {
        fail("TODO 1.4.5: refactoriza DetectorDeCaidas y escribe aquí sus pruebas");
    }
}
