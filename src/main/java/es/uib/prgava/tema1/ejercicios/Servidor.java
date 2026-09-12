package es.uib.prgava.tema1.ejercicios;

/**
 * Ejercicio 1.1.2. Servidor con nombre, dirección y puerto.
 *
 * <p>Clase tradicional (no un {@code record}): el objetivo es practicar la encapsulación con
 * todas sus piezas. Fíjate en que no hay ni debe haber {@code setDireccion} ni {@code setPuerto}.
 */
public class Servidor {

    // TODO 1.1.2: declara aquí el atributo de clase que cuenta los servidores creados.

    private String nombre;
    private DireccionIpv4 direccion;
    private int puerto;
    private boolean enServicio;

    public Servidor(String nombre, DireccionIpv4 direccion, int puerto) {
        // TODO 1.1.2: valida los argumentos, inicializa el estado (fuera de servicio)
        // e incrementa el contador de servidores creados.
        throw new UnsupportedOperationException("TODO 1.1.2: constructor de Servidor");
    }

    /** Constructor sobrecargado que usa el puerto 443. Debe delegar en el anterior con this(...). */
    public Servidor(String nombre, DireccionIpv4 direccion) {
        // TODO 1.1.2: delega, no repitas la validación.
        throw new UnsupportedOperationException("TODO 1.1.2: constructor sobrecargado de Servidor");
    }

    public static int getServidoresCreados() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.getServidoresCreados");
    }

    public void arrancar() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.arrancar");
    }

    public void parar() {
        // TODO 1.1.2
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.parar");
    }

    public String getNombre() {
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.getNombre");
    }

    public DireccionIpv4 getDireccion() {
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.getDireccion");
    }

    public int getPuerto() {
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.getPuerto");
    }

    public boolean isEnServicio() {
        throw new UnsupportedOperationException("TODO 1.1.2: Servidor.isEnServicio");
    }

    // TODO 1.1.2: redefine equals y hashCode (solo dirección y puerto) y toString.

    // TODO 1.1.2: explica aquí, en dos líneas, qué invariante te permite no ofrecer
    // setDireccion ni setPuerto.
}
