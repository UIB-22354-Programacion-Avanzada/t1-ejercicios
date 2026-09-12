package es.uib.prgava.tema1.monitor;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Ejercicio 1.2.7. */
class SondaConRegistroTest {

    private static final Servicio WEB = Servicio.desde("https://www.uib.es");

    @Test
    void cuentaCadaSondeoYDelegaSinAlterarElResultado() {
        Sonda base = servicio -> Resultado.activo(servicio, Duration.ofMillis(100));
        var sonda = new SondaConRegistro(base);

        var resultado = sonda.sondear(WEB);
        sonda.sondear(WEB);

        assertEquals(Estado.ACTIVO, resultado.estado());
        assertEquals(2, sonda.conteos().get(WEB));
    }

    @Test
    void elOrdenDeLosDecoradoresCambiaLoQueSeMide() {
        Sonda base = Resultado::caido;                     // siempre falla

        var fuera = new SondaConRegistro(new SondaConReintentos(base, 3));
        var dentro = new SondaConRegistro(base);
        Sonda envuelta = new SondaConReintentos(dentro, 3);

        fuera.sondear(WEB);
        envuelta.sondear(WEB);

        assertEquals(1, fuera.conteos().get(WEB));    // una comprobación lógica
        assertEquals(3, dentro.conteos().get(WEB));   // tres sondeos reales
    }
}
