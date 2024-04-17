import java.util.HashMap;
import java.util.Map;

public class GestorClientes {
    private Map<String, Cliente> clientes;

    public GestorClientes() {
        clientes = new HashMap<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.put(cliente.getNombreUsuario(), cliente);
        String pais = cliente.getPais();
        if (pais.equalsIgnoreCase("Estados Unidos")){
            cliente.setIdiomaStrategy(new IdiomaIngles());
            cliente.setEstrategiaOferta(new OfertaElectronica());
        }else if (pais.equalsIgnoreCase("España")){
            cliente.setIdiomaStrategy(new IdiomaEspanol());
            cliente.setEstrategiaOferta(new OfertaElectrodomesticos());
        }else if(pais.equalsIgnoreCase("Mexico")){
            cliente.setIdiomaStrategy(new IdiomaEspMexico());
            cliente.setEstrategiaOferta(new OfertaAlimentos());
        }

        //Suscribir al Cliente
        GestorOfertas gestorOfertas = GestorOfertas.getInstance();
        gestorOfertas.suscribir(cliente.getEstrategiaOferta());
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