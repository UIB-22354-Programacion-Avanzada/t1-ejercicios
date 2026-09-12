package es.uib.prgava.tema1.ejercicios;

import java.util.List;

import org.junit.jupiter.api.Test;

import es.uib.prgava.tema1.monitor.RepositorioEnMemoria;
import es.uib.prgava.tema1.monitor.Resultado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.3.8. */
class RachasTest {

    private static final List<Resultado> CON_RACHA = List.of(
            Datos.ok(Datos.WEB, 100),
            Datos.fallo(Datos.WEB),
            Datos.fallo(Datos.WEB),
            Datos.ok(Datos.WEB, 200),
            Datos.fallo(Datos.WEB));

    @Test
    void todosReuneLosResultadosDeTodosLosServicios() {
        var repositorio = new RepositorioEnMemoria();
        Datos.historialDeEjemplo().forEach(repositorio::guardar);

        var todos = InformesEjercicio.todos(repositorio);

        assertEquals(9, todos.size());
        for (int i = 1; i < todos.size(); i++) {
            assertTrue(!todos.get(i).instante().isBefore(todos.get(i - 1).instante()),
                    "la lista debe estar ordenada por instante");
        }
    }

    @Test
    void calculaLaRachaMaximaConBucle() {
        assertEquals(2, InformesEjercicio.rachaMaximaDeFallos(CON_RACHA));
        assertEquals(0, InformesEjercicio.rachaMaximaDeFallos(List.of(Datos.ok(Datos.WEB, 1))));
    }

    @Test
    void lasDosVersionesDanElMismoResultado() {
        assertEquals(InformesEjercicio.rachaMaximaDeFallos(CON_RACHA),
                InformesEjercicio.rachaMaximaConReduce(CON_RACHA));
    }
}
