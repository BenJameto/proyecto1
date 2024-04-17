import java.util.HashMap;
import java.util.Map;

public class GestorClientes {
    private Map<String, Cliente> clientes;

    public GestorClientes() {
        clientes = new HashMap<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.put(cliente.getNombreUsuario(), cliente);
    }

    public Cliente obtenerCliente(String nombreUsuario) {
        return clientes.get(nombreUsuario);
    }

    public boolean autenticarCliente(String nombreUsuario, String contrasenia) {
        Cliente cliente = obtenerCliente(nombreUsuario);
        if (cliente != null && cliente.getContrasenia().equals(contrasenia)) {
            return true;
        }
        return false;
    }
}