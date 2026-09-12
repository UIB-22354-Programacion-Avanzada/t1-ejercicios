package es.uib.prgava.tema1.ejercicios;

import es.uib.prgava.tema1.monitor.RepositorioEnMemoria;
import es.uib.prgava.tema1.monitor.Servicio;

/**
 * Ejercicio 1.2.5. Esta clase <strong>ya está escrita</strong>. Funciona, pero es imposible de
 * probar: crea ella misma su repositorio y escribe directamente en la consola.
 *
 * <p>No la modifiques: escribe {@link InformeDiario} invirtiendo las dependencias.
 */
public final class InformeDiarioAcoplado {

    private final RepositorioEnMemoria repositorio = new RepositorioEnMemoria();

    public void emitir() {
        System.out.println("=== Informe diario ===");
        for (Servicio servicio : repositorio.servicios()) {
            long comprobaciones = repositorio.historial(servicio).size();
            System.out.println(servicio.nombre() + ": " + comprobaciones + " comprobaciones");
        }
    }
}
