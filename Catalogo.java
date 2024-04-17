import java.util.ArrayList;

public interface Catalogo {
    ArrayList<Producto> obtenerProductos();
    void agregarProducto (Producto producto);
    void eliminarProducto (String codigoBarras);
}
