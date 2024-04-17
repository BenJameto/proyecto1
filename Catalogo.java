import java.util.List;

public interface Catalogo {
    List<Producto> obtenerProductos();
    void agregarProducto (Producto producto);
    void eliminarProducto (String codigoBarras);
}
