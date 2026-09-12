package es.uib.prgava.tema1.ejercicios;

import java.util.List;
import java.util.Optional;

/**
 * Ejercicio 1.2.4. Un catálogo consulta y da de alta, pero <strong>no administra</strong>:
 * no reinicia dispositivos ni les actualiza el firmware.
 */
public final class CatalogoEnMemoria implements ConsultaDispositivos, AltaDispositivos {

    public Optional<FichaDispositivo> buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("TODO 1.2.4: CatalogoEnMemoria.buscarPorNombre");
    }

    public List<FichaDispositivo> listarTodos() {
        throw new UnsupportedOperationException("TODO 1.2.4: CatalogoEnMemoria.listarTodos");
    }

    public int contar() {
        throw new UnsupportedOperationException("TODO 1.2.4: CatalogoEnMemoria.contar");
    }

    public void registrar(FichaDispositivo ficha) {
        throw new UnsupportedOperationException("TODO 1.2.4: CatalogoEnMemoria.registrar");
    }

    public void eliminar(String nombre) {
        throw new UnsupportedOperationException("TODO 1.2.4: CatalogoEnMemoria.eliminar");
    }

    // TODO 1.2.4: cuando hayas movido los métodos a las interfaces de rol, añade @Override
    // a los cinco métodos de arriba. Si alguno no compila con @Override, es que lo has
    // colocado en la interfaz equivocada.
}
