package es.uib.prgava.tema1.ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Ejercicio 1.1.6. */
class LectorUmbralesTest {

    private static Path ficheroCon(String contenido) throws IOException {
        Path fichero = Files.createTempFile("umbrales", ".txt");
        fichero.toFile().deleteOnExit();
        Files.writeString(fichero, contenido);
        return fichero;
    }

    @Test
    void leeLasLineasValidasEIgnoraComentariosYBlancos() throws IOException {
        Path fichero = ficheroCon("# comentario\n\nweb=300\ndns=150\n");

        var umbrales = LectorUmbrales.leer(fichero);

        assertEquals(2, umbrales.size());
        assertEquals(Duration.ofMillis(300), umbrales.get("web"));
    }

    @Test
    void unValorNoNumericoSenalaLaLineaYConservaLaCausa() throws IOException {
        Path fichero = ficheroCon("web=300\ndns=rapido\n");

        var error = assertThrows(UmbralInvalidoException.class, () -> LectorUmbrales.leer(fichero));

        assertEquals(2, error.linea());
        assertNotNull(error.getCause());
    }

    @Test
    void unValorNoPositivoEsInvalido() throws IOException {
        Path fichero = ficheroCon("web=0\n");

        assertThrows(UmbralInvalidoException.class, () -> LectorUmbrales.leer(fichero));
    }

    @Test
    void unaClaveRepetidaEsInvalida() throws IOException {
        Path fichero = ficheroCon("web=300\nweb=400\n");

        assertThrows(UmbralInvalidoException.class, () -> LectorUmbrales.leer(fichero));
    }

    @Test
    void elMapaDevueltoEsInmutable() throws IOException {
        var umbrales = LectorUmbrales.leer(ficheroCon("web=300\n"));

        assertThrows(UnsupportedOperationException.class,
                () -> umbrales.put("otro", Duration.ofMillis(1)));
    }
}
