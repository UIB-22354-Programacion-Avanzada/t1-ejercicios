package es.uib.prgava.tema1.ejercicios;

import java.util.List;

/**
 * Ejercicio 1.3.4. Las cinco líneas comentadas <strong>no compilan</strong>.
 *
 * <p>Descoméntalas de una en una, anota junto a cada una el mensaje del compilador y explica la
 * razón en términos de borrado de tipos. Vuelve a comentarlas al terminar para que el proyecto
 * siga compilando.
 */
public final class Borrado {

    private Borrado() { }

    public static <T> void ejemplos(List<T> lista, Object objeto) {
        // (1) T[] array = new T[10];
        // (2) if (objeto instanceof List<String> cadenas) { System.out.println(cadenas); }
        // (3) if (lista instanceof java.util.ArrayList<T> arreglo) { System.out.println(arreglo); }
        // (4) List<String>[] arrayDeListas = new List<String>[3];
        // (5) System.out.println(T.class);
    }

    // (6) Estas dos sobrecargas tampoco pueden coexistir. Descoméntalas y explica por qué.
    // public static void procesar(List<String> cadenas) { }
    // public static void procesar(List<Integer> enteros) { }
}
