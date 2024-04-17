import java.util.ArrayList;

public class CatalogoProxy implements Catalogo {
    private CatalogoReal catalogoReal;

    public CatalogoProxy() {
        catalogoReal = new CatalogoReal();
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return catalogoReal.obtenerProductos();
    }

    @Override
    public void agregarProducto(Producto producto) {
        catalogoReal.agregarProducto(producto);
    }

    @Override
    public void eliminarProducto(String codigoBarras) {
        catalogoReal.eliminarProducto(codigoBarras);
    }
}