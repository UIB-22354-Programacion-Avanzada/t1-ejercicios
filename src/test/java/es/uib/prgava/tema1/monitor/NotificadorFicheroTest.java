package es.uib.prgava.tema1.monitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.6. */
class NotificadorFicheroTest {

    private static final Servicio WEB = Servicio.desde("https://www.uib.es");

    @Test
    void anadeUnaLineaPorAlerta() throws IOException {
        Path destino = Files.createTempFile("alertas", ".csv");
        destino.toFile().deleteOnExit();
        Files.delete(destino);            // el notificador debe crear el fichero si no existe
        var notificador = new NotificadorFichero(destino);

        notificador.notificar(Alerta.ahora(WEB, "primera"));
        notificador.notificar(Alerta.ahora(WEB, "segunda"));

        List<String> lineas = Files.readAllLines(destino);
        assertEquals(2, lineas.size());
        assertTrue(lineas.get(0).contains("https://www.uib.es"));
        assertTrue(lineas.get(1).contains("segunda"));
    }

    @Test
    void todosLosSuscriptoresRecibenLasMismasAlertas() throws IOException {
        Path destino = Files.createTempFile("alertas", ".csv");
        destino.toFile().deleteOnExit();
        Files.delete(destino);
        var registro = new NotificadorRegistro();
        var monitor = new Monitor(servicio -> Resultado.caido(servicio),
                new FallosConsecutivos(2), new RepositorioEnMemoria());
        monitor.suscribir(registro);
        monitor.suscribir(new NotificadorFichero(destino));

        monitor.comprobar(List.of(WEB, WEB, WEB));

        assertEquals(registro.alertas().size(), Files.readAllLines(destino).size());
    }
}
