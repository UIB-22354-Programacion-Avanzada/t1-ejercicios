package es.uib.prgava.tema1.monitor;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Ejercicio 1.2.2. Pruebas mínimas; el juego completo de casos es el ejercicio 1.4.1.
 */
class FallosEnVentanaBasicoTest {

    private static final Servicio WEB = Servicio.desde("https://www.uib.es");
    private static final Resultado OK = Resultado.activo(WEB, Duration.ofMillis(100));
    private static final Resultado FALLO = Resultado.caido(WEB);

    @Test
    void dosFallosNoConsecutivosDentroDeLaVentanaAlertan() {
        assertTrue(new FallosEnVentana(2, 5).debeAlertar(List.of(FALLO, OK, OK, OK, FALLO)));
    }

    @Test
    void unFalloDemasiadoAntiguoQuedaFueraDeLaVentana() {
        assertFalse(new FallosEnVentana(2, 5).debeAlertar(List.of(FALLO, OK, OK, OK, OK, OK)));
    }

    @Test
    void seCombinaConOtrasPoliticasSinTocarMonitor() {
        PoliticaDeAlerta combinada = new FallosEnVentana(2, 5)
                .o(new LatenciaExcesiva(Duration.ofMillis(500), 1));

        assertTrue(combinada.debeAlertar(List.of(Resultado.degradado(WEB, Duration.ofMillis(900)))));
    }
}
