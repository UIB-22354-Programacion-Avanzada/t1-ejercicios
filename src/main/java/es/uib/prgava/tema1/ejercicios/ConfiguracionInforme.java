package es.uib.prgava.tema1.ejercicios;

/** Ejercicio 1.2.9. Opciones de un informe, construidas con un <em>builder</em>. */
public record ConfiguracionInforme(String titulo, int maximoServicios,
                                   boolean incluirLatencias, boolean soloConFallos) {

    public ConfiguracionInforme {
        // TODO 1.2.9: título no nulo ni en blanco, maximoServicios >= 1.
    }

    public static Builder builder() {
        // TODO 1.2.9
        throw new UnsupportedOperationException("TODO 1.2.9: ConfiguracionInforme.builder");
    }

    /** Valores por defecto: "Informe de disponibilidad", 10, true, false. */
    public static final class Builder {

        private Builder() { }

        public Builder titulo(String titulo) {
            throw new UnsupportedOperationException("TODO 1.2.9: Builder.titulo");
        }

        public Builder maximoServicios(int maximo) {
            throw new UnsupportedOperationException("TODO 1.2.9: Builder.maximoServicios");
        }

        public Builder incluirLatencias(boolean incluir) {
            throw new UnsupportedOperationException("TODO 1.2.9: Builder.incluirLatencias");
        }

        public Builder soloConFallos(boolean solo) {
            throw new UnsupportedOperationException("TODO 1.2.9: Builder.soloConFallos");
        }

        /** Toda la validación la hace el constructor compacto del record. */
        public ConfiguracionInforme build() {
            throw new UnsupportedOperationException("TODO 1.2.9: Builder.build");
        }
    }
}
