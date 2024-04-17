
/*
 * interfaz encargada de obtener las cadenas de texto en diferentes idiomas
 */
public interface IdiomaStrategy {
    String obtenerSaludo();
    String obtenerDespedida();
    String obtenerMenuOpciones();
    String obtenerMensajeCompraExitosa();
    String obtenerMensajeFechaEntrega();
}