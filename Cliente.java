import java.util.UUID;
/*
 * clase que implementa al cliente
 */
public class Cliente {
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String pais;
    private UUID idCliente;
    private IdiomaStrategy idiomaStrategy;
    private ObservadorOferta estrategiaOferta;

    //constructor
    public Cliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion,
            String cuentaBancaria, String pais, UUID idCliente, IdiomaStrategy idiomaStrategy,
            ObservadorOferta estrategiaOferta) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.pais = pais;
        this.idCliente = idCliente;
        this.idiomaStrategy = idiomaStrategy;
        this.estrategiaOferta = estrategiaOferta;
    }

    public IdiomaStrategy getIdiomaStrategy() {
        return idiomaStrategy;
    }

    public void setIdiomaStrategy (IdiomaStrategy idiomaStrategy){
        this.idiomaStrategy = idiomaStrategy;
    }

    public ObservadorOferta getEstrategiaOferta() {
        return estrategiaOferta;
    }

    public void setEstrategiaOferta(ObservadorOferta estrategiaOferta) {
        this.estrategiaOferta = estrategiaOferta;
    }

     //GETERS AND SETTERS
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }
    
    
    //PARA EL IDIOMA

    public String obtenerSaludo(){
        return idiomaStrategy.obtenerSaludo();
    }
    
    public String obtenerDespedida(){
        return idiomaStrategy.obtenerDespedida();
    }

    public String obtenerMenu(){
        return idiomaStrategy.obtenerMenuOpciones();
    }

    public String compraExitosa(){
        return idiomaStrategy.obtenerMensajeCompraExitosa();
    }

    public String fechaEntrega(){
        return idiomaStrategy.obtenerMensajeFechaEntrega();
    }
}