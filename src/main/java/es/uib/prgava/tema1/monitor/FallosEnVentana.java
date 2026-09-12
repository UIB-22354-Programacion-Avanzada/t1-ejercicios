package es.uib.prgava.tema1.monitor;

import java.util.List;

/**
 * Ejercicio 1.2.2. Alerta cuando hay al menos {@code minimoFallos} fallos entre las últimas
 * {@code tamanoVentana} comprobaciones. A diferencia de {@link FallosConsecutivos}, los fallos
 * no tienen por qué ser seguidos.
 *
 * <p>Debes conseguirlo sin modificar {@link Monitor} ni {@link PoliticaDeAlerta}.
 */
public final class FallosEnVentana implements PoliticaDeAlerta {

    private final int minimoFallos;
    private final int tamanoVentana;

    public FallosEnVentana(int minimoFallos, int tamanoVentana) {
        // TODO 1.2.2: valida que 1 <= minimoFallos <= tamanoVentana.
        this.minimoFallos = minimoFallos;
        this.tamanoVentana = tamanoVentana;
    }

    @Override
    public boolean debeAlertar(List<Resultado> historial) {
        // TODO 1.2.2
        throw new UnsupportedOperationException("TODO 1.2.2: FallosEnVentana.debeAlertar");
    }

    @Override
    public String toString() {
        // TODO 1.2.2: por ejemplo "2 fallos en las últimas 5 comprobaciones".
        throw new UnsupportedOperationException("TODO 1.2.2: FallosEnVentana.toString");
    }
}
