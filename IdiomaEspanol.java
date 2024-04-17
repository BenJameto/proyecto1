public class IdiomaEspanol implements IdiomaStrategy {

    @Override
    public String obtenerSaludo() {
       return "Ostia tí@, bienvenid@";
    }

    @Override
    public String obtenerDespedida() {
        return "A tomar por culto tío, ja! te he pillado leyendo mal";
    }

    @Override
    public String obtenerMenuOpciones() {
        String s = "leer con tonito español \n" + "1. Ver catálogo \n" + "2. Realizar una compra \n" + "3. Salir \n" ;
        return s;
    }

    @Override
    public String obtenerMensajeCompraExitosa() {
        return "En horabuena tu compra ha sido exitosa";
    }

    @Override
    public String obtenerMensajeFechaEntrega() {
        return "Tu pedido sera entregado en un plazo no mayor a 48 horas.";
    }
    
}
