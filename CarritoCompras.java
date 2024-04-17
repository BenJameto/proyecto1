import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos;

    public CarritoCompras(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Producto producto : productos){
            total += producto.getPrecio();
        }
        return total;
    }
}
