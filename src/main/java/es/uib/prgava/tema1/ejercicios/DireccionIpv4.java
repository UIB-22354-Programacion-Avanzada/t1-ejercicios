package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicio 1.1.1. Dirección IPv4 como cuatro octetos.
 *
 * <p>No escribas {@code equals} ni {@code hashCode}: parte del ejercicio es entender por qué
 * no hacen falta.
 */
public record DireccionIpv4(int primero, int segundo, int tercero, int cuarto) {

    public DireccionIpv4 {
        // TODO 1.1.1: cada octeto debe estar entre 0 y 255. Si alguno no lo está, lanza
        // IllegalArgumentException con el mensaje "Octeto fuera de rango: " + valorInvalido.
    }

    /**
     * Crea una dirección a partir de cuatro números separados por puntos.
     *
     * @throws IllegalArgumentException si no hay cuatro partes o alguna no es un entero
     */
    public static DireccionIpv4 desde(String texto) {
        // TODO 1.1.1
        throw new UnsupportedOperationException("TODO 1.1.1: DireccionIpv4.desde");
    }

    /** Devuelve la forma habitual, por ejemplo {@code 192.168.1.1}. */
    @Override
    public String toString() {
        // TODO 1.1.1
        throw new UnsupportedOperationException("TODO 1.1.1: DireccionIpv4.toString");
    }

    /** Indica si la dirección pertenece a un rango privado (10/8, 172.16/12, 192.168/16). */
    public boolean esPrivada() {
        // TODO 1.1.1
        throw new UnsupportedOperationException("TODO 1.1.1: DireccionIpv4.esPrivada");
    }
}
