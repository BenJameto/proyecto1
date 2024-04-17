import java.util.ArrayList;

public class CatalogoReal implements Catalogo {
    private ArrayList<Producto> productos;

    public CatalogoReal(){
        productos.add(new Producto("4648728326817107", "Laptop ", "Electronica", 9999.99));
        productos.add(new Producto("9349613773773701", "Smartphone", "Electronica", 15099.99));
        productos.add(new Producto("9576725813100027", "Impresora", "Electronica", 3999.99));
        productos.add(new Producto("1287944879852332", "Refrigerador", "Electrodomesticos", 14999.99));
        productos.add(new Producto("8533174442000601", "Estufa", "Electrodomesticos", 4999.99));
        productos.add(new Producto("9119556662903443", "Microondas", "Electrodomesticos", 599.99));
        productos.add(new Producto("3559184763736905", "Leche", "Alimentos", 35.99));
        productos.add(new Producto("2565416626188470", "Ceral", "Alimentos", 89.99));
        productos.add(new Producto("7611977683035262", "Huevo", "Alimentos", 40.99));
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void eliminarProducto(String codigoBarras) {
        productos.removeIf(p -> p.getCodigoBarras().equals(codigoBarras));
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }
}
