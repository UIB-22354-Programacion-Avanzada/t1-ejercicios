package es.uib.prgava.tema1.ejercicios;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.RepositorioEnMemoria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.5. Ninguna de estas pruebas escribe en la consola. */
class InformeDiarioTest {

    @Test
    void emiteElInformeAlConsumerRecibido() {
        var repositorio = new RepositorioEnMemoria();
        Datos.historialDeEjemplo().forEach(repositorio::guardar);
        List<String> lineas = new ArrayList<>();

        new InformeDiario(repositorio, lineas::add).emitir();

        assertFalse(lineas.isEmpty(), "el informe no ha emitido ninguna línea");
        assertTrue(lineas.stream().anyMatch(l -> l.contains("dns:uib.es")),
                "esperaba una línea para dns:uib.es, y obtuve " + lineas);
    }

    @Test
    void unRepositorioVacioNoRompeElInforme() {
        List<String> lineas = new ArrayList<>();

        new InformeDiario(new RepositorioEnMemoria(), lineas::add).emitir();

        assertFalse(lineas.isEmpty(), "al menos debe emitirse la cabecera");
    }
}
