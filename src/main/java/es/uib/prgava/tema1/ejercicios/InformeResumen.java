package es.uib.prgava.tema1.ejercicios;

import java.util.Optional;

import es.uib.prgava.tema1.monitor.LectorResultados;
import es.uib.prgava.tema1.monitor.Servicio;

/** Ejercicio 1.2.9. Informe que respeta las opciones de una {@link ConfiguracionInforme}. */
public final class InformeResumen {

    public InformeResumen(LectorResultados lector, ConfiguracionInforme configuracion) {
        // TODO 1.2.9
        throw new UnsupportedOperationException("TODO 1.2.9: constructor de InformeResumen");
    }

    /** Texto del informe, respetando título, número máximo de servicios y filtros. */
    public String texto() {
        throw new UnsupportedOperationException("TODO 1.2.9: InformeResumen.texto");
    }

    /**
     * Servicio con menor disponibilidad, o vacío si el repositorio no tiene datos.
     *
     * <p>Prohibido devolver {@code null}.
     */
    public Optional<Servicio> peorServicio() {
        throw new UnsupportedOperationException("TODO 1.2.9: InformeResumen.peorServicio");
    }
}
