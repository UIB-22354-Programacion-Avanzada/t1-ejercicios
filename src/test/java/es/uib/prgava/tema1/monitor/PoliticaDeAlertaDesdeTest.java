package es.uib.prgava.tema1.monitor;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.2.8. */
class PoliticaDeAlertaDesdeTest {

    private static final Servicio WEB = Servicio.desde("https://www.uib.es");
    private static final Resultado OK = Resultado.activo(WEB, Duration.ofMillis(100));
    private static final Resultado FALLO = Resultado.caido(WEB);

    @Test
    void reconoceLaPoliticaSimple() {
        assertInstanceOf(FalloSimple.class, PoliticaDeAlerta.desde("simple"));
    }

    @Test
    void reconoceLosFallosConsecutivos() {
        var politica = PoliticaDeAlerta.desde("consecutivos:3");

        assertFalse(politica.debeAlertar(List.of(FALLO, FALLO)));
        assertTrue(politica.debeAlertar(List.of(FALLO, FALLO, FALLO)));
    }

    @Test
    void reconoceLaVentana() {
        var politica = PoliticaDeAlerta.desde("ventana:2:5");

        assertTrue(politica.debeAlertar(List.of(FALLO, OK, OK, OK, FALLO)));
    }

    @Test
    void unTextoInvalidoSeRechazaConUnMensajeUtil() {
        var error = assertThrows(IllegalArgumentException.class,
                () -> PoliticaDeAlerta.desde("consecutivos:x"));

        assertTrue(error.getMessage().contains("consecutivos:x"),
                "el mensaje debe incluir el texto recibido: " + error.getMessage());
        assertThrows(IllegalArgumentException.class, () -> PoliticaDeAlerta.desde("basura"));
    }
}
