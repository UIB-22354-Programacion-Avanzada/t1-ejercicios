package es.uib.prgava.tema1.ejercicios;

import java.util.List;
import java.util.Optional;

/**
 * Ejercicio 1.2.4. Esta interfaz <strong>ya está escrita</strong> y es demasiado grande: mezcla
 * consulta, alta y administración.
 *
 * <p>Divídela por roles en {@link ConsultaDispositivos}, {@link AltaDispositivos} y
 * {@link AdministracionDispositivos}, y deja esta interfaz extendiendo a las tres.
 */
public interface GestorDispositivos {

    Optional<FichaDispositivo> buscarPorNombre(String nombre);

    List<FichaDispositivo> listarTodos();

    int contar();

    void registrar(FichaDispositivo ficha);

    void eliminar(String nombre);

    void reiniciar(String nombre);

    void actualizarFirmware(String nombre, String version);

    void restaurarValoresDeFabrica(String nombre);
}
