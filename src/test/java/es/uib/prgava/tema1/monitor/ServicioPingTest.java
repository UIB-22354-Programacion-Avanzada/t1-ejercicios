package es.uib.prgava.tema1.monitor;

/**
 * Ejercicio 1.1.5. Esta prueba está entera comentada a propósito: <strong>no compila</strong>
 * hasta que hayas creado {@code ServicioPing} y lo hayas añadido a la cláusula {@code permits}
 * de {@link Servicio}.
 *
 * <p>Ese es justamente el punto del ejercicio: descubrir qué deja de compilar. Descoméntala
 * cuando termines.
 */
class ServicioPingTest {

    // @org.junit.jupiter.api.Test
    // void desdeReconoceLaFormaPing() {
    //     Servicio servicio = Servicio.desde("ping:www.uib.es");
    //
    //     org.junit.jupiter.api.Assertions.assertEquals("ping:www.uib.es", servicio.nombre());
    //     org.junit.jupiter.api.Assertions.assertInstanceOf(ServicioPing.class, servicio);
    // }
    //
    // @org.junit.jupiter.api.Test
    // void describirContemplaElNuevoTipo() {
    //     String texto = Descripciones.describir(Servicio.desde("ping:www.uib.es"));
    //
    //     org.junit.jupiter.api.Assertions.assertTrue(texto.contains("www.uib.es"));
    // }
    //
    // @org.junit.jupiter.api.Test
    // void unHostVacioSeRechaza() {
    //     org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class,
    //             () -> Servicio.desde("ping:   "));
    // }
}
