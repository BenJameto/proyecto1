import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaVirtual {
    private GestorClientes gestorClientes;
    private Catalogo catalogo;
    private Map<Cliente, CarritoCompras> carritoCompras;

    public TiendaVirtual() {
        gestorClientes = new GestorClientes();
        catalogo = new CatalogoProxy();
        carritoCompras = new HashMap<>();
    }

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasenia = scanner.nextLine();

        if (gestorClientes.autenticarCliente(nombreUsuario, contrasenia)) {
            Cliente cliente = gestorClientes.obtenerCliente(nombreUsuario);
            System.out.println(cliente.getIdiomaStrategy().obtenerSaludo());

            if (cliente.getEstrategiaOferta() != null) {
                String oferta = generarOfertaAleatoria();
                cliente.getEstrategiaOferta().recibirOferta(oferta);
            }

            carritoCompras.put(cliente, new CarritoCompras());
            menuPrincipal(cliente, scanner);
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }

    private void menuPrincipal(Cliente cliente, Scanner scanner) {
        String opcion;
        do {
            System.out.println(cliente.getIdiomaStrategy().obtenerMenuOpciones());
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verCatalogo(cliente);
                    break;
                case "2":
                    realizarCompra(cliente, scanner);
                    break;
                case "3":
                    System.out.println(cliente.getIdiomaStrategy().obtenerDespedida());
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (!opcion.equals("3"));
    }

    private void verCatalogo(Cliente cliente) {
        System.out.println("Catálogo de productos:");
        ArrayList<Producto> productos = catalogo.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }
    }

    private void realizarCompra(Cliente cliente, Scanner scanner) {
        CarritoCompras carrito = carritoCompras.get(cliente);
        String opcion;
        do {
            verCatalogo(cliente);
            System.out.println("\nIngrese el nombre del producto que desea agregar al carrito (o 'terminar' para finalizar):");
            opcion = scanner.nextLine();

            if (!opcion.equalsIgnoreCase("terminar")) {
                Producto producto = buscarProducto(opcion);
                if (producto != null) {
                    carrito.agregarProducto(producto);
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }
        } while (!opcion.equalsIgnoreCase("terminar"));

        if (carrito.getProductos().size() > 0) {
            realizarCompraSegura(cliente, carrito, scanner);
        } else {
            System.out.println("No hay productos en el carrito.");
        }
    }

    private Producto buscarProducto(String nombreProducto) {
        ArrayList<Producto> productos = catalogo.obtenerProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    private void realizarCompraSegura(Cliente cliente, CarritoCompras carrito, Scanner scanner) {
        System.out.print("Ingrese su número de cuenta bancaria: ");
        String cuentaBancaria = scanner.nextLine();

        if (cliente.getCuentaBancaria().equals(cuentaBancaria)) {
            System.out.println("Compra realizada con éxito.");
            // Aquí puedes agregar la lógica para procesar el pago y generar la fecha estimada de entrega
            String fechaEstimada = generarFechaEstimadaEntrega();
            System.out.println("Fecha estimada de entrega: " + fechaEstimada);
        } else {
            System.out.println("Número de cuenta bancaria incorrecto. Compra cancelada.");
        }
    }

    private String generarOfertaAleatoria() {
        // Aquí puedes implementar la lógica para generar una oferta aleatoria
        double descuento = Math.random() * 0.4 + 0.1; // Descuento entre 10% y 50%
        return "¡Oferta especial! Descuento del " + (int) (descuento * 100) + "% en compras hoy.";
    }

    private String generarFechaEstimadaEntrega() {
        // Aquí puedes implementar la lógica para generar una fecha estimada de entrega
        int diasEntrega = (int) (Math.random() * 10) + 5; // Entre 5 y 14 días
        return "En aproximadamente " + diasEntrega + " días";
    }

    public static void main(String[] args) {
        TiendaVirtual tiendaVirtual = new TiendaVirtual();
        tiendaVirtual.iniciarSesion();
    }
}
