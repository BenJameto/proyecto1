public class IdiomaIngles implements IdiomaStrategy {

    @Override
    public String obtenerSaludo() {
        return "Welcome to MarketChems";
    }

    @Override
    public String obtenerDespedida() {
        return "Good bye, come back soon";
    }

    @Override
    public String obtenerMenuOpciones() {
        String s = "1. View catalog\n"+"2. Make a purchase\n"+"3. Exit";
        return s;
    }

    @Override
    public String obtenerMensajeCompraExitosa() {
        return "Your purchase has been successful";
    }

    @Override
    public String obtenerMensajeFechaEntrega() {
        return "You will receive your order within a period of no more than 48 hours";
    }

}
