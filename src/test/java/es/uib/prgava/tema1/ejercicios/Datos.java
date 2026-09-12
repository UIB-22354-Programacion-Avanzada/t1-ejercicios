package es.uib.prgava.tema1.ejercicios;

import java.time.Duration;
import java.util.List;

import es.uib.prgava.tema1.monitor.Resultado;
import es.uib.prgava.tema1.monitor.Servicio;

/** Datos de ejemplo compartidos por las pruebas. Ya está escrito: no hace falta que lo toques. */
public final class Datos {

    public static final Servicio WEB = Servicio.desde("https://www.uib.es");
    public static final Servicio DNS = Servicio.desde("dns:uib.es");
    public static final Servicio TCP = Servicio.desde("tcp:mail.uib.es:25");

    private Datos() { }

    public static Resultado ok(Servicio servicio, long milisegundos) {
        return Resultado.activo(servicio, Duration.ofMillis(milisegundos));
    }

    public static Resultado lento(Servicio servicio, long milisegundos) {
        return Resultado.degradado(servicio, Duration.ofMillis(milisegundos));
    }

    public static Resultado fallo(Servicio servicio) {
        return Resultado.caido(servicio);
    }

    /** WEB: 3 correctos y 1 fallo. DNS: 1 correcto y 2 fallos. TCP: 2 correctos. */
    public static List<Resultado> historialDeEjemplo() {
        return List.of(
                ok(WEB, 100), ok(WEB, 200), fallo(WEB), ok(WEB, 300),
                ok(DNS, 40), fallo(DNS), fallo(DNS),
                ok(TCP, 500), lento(TCP, 900));
    }
}
