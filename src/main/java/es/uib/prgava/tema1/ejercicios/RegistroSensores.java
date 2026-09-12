package es.uib.prgava.tema1.ejercicios;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 1.2.1. Esta clase <strong>ya está escrita</strong> y funciona, pero tiene más de una
 * razón para cambiar: almacena lecturas, calcula estadísticas y además escribe ficheros.
 *
 * <p>No la borres: sepárala en {@link EstadisticasSensor} y {@link ExportadorCsv} y comprueba
 * que la salida no cambia.
 */
public final class RegistroSensores {

    private final List<Double> lecturas = new ArrayList<>();

    public void registrar(double lectura) {
        lecturas.add(lectura);
    }

    public int cuantas() {
        return lecturas.size();
    }

    public double media() {
        return lecturas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public double maximo() {
        return lecturas.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
    }

    public double minimo() {
        return lecturas.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
    }

    public void exportarCsv(Path destino) {
        var filas = new ArrayList<String>();
        filas.add("metrica;valor");
        filas.add("cuantas;" + cuantas());
        filas.add("media;" + media());
        filas.add("maximo;" + maximo());
        filas.add("minimo;" + minimo());
        try {
            Files.write(destino, filas);
        } catch (IOException e) {
            throw new UncheckedIOException("No se pudo escribir " + destino, e);
        }
    }
}
