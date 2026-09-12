package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.poo.DispositivoRed;

/** Ejercicio 1.1.4. Punto de acceso inalámbrico, subclase de {@link DispositivoRed}. */
public class PuntoAcceso extends DispositivoRed {

    public enum Banda { GHZ_24, GHZ_5 }

    private Banda banda;
    private int canal;

    public PuntoAcceso(String nombre, String direccionIp, Banda banda, int canal) {
        super(nombre, direccionIp);
        // TODO 1.1.4: guarda banda y canal, validando el canal según la banda
        // (1..14 en GHZ_24, 36..165 en GHZ_5). Extrae la comprobación a un método privado.
        throw new UnsupportedOperationException("TODO 1.1.4: constructor de PuntoAcceso");
    }

    public Banda getBanda() {
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.getBanda");
    }

    public int getCanal() {
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.getCanal");
    }

    public void cambiarCanal(int nuevoCanal) {
        // TODO 1.1.4: misma validación que en el constructor, sin duplicarla.
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.cambiarCanal");
    }

    @Override
    public String toString() {
        // TODO 1.1.4: incluye nombre, IP, banda y canal.
        throw new UnsupportedOperationException("TODO 1.1.4: PuntoAcceso.toString");
    }

    // TODO 1.1.4: responde aquí por qué toString tiene que usar getNombre() y no el campo
    // nombre de la superclase.
}
