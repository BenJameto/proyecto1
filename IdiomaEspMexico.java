public class IdiomaEspMexico implements IdiomaStrategy {

    @Override
    public String obtenerSaludo() {
        return "Que tranza, bienvenid@ al Chemsmart";
    }
    
    @Override
    public String obtenerDespedida() {
        return "Ay nos vidrios";
    }

    @Override
    public String obtenerMenuOpciones() {
        String s = "1. Ver el catalogo \n" + "2. Comprar algo \n" + "3. Dice mi mamá que siempre no";
        return s;
    }
    
    @Override
    public String obtenerMensajeCompraExitosa() {
        return "cámara, tu compra ha sido exitosa bro";
    }

    @Override
    public String obtenerMensajeFechaEntrega() {
        return "tu compra te llegara en maximo maximo maximo 2 dias bro (si todo sale bien)";
    }

    

    
    
}
