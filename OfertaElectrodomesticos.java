public class OfertaElectrodomesticos implements ObservadorOferta {

    @Override
    public void recibirOferta(String oferta) {
        System.out.println("¿Algo de tu casa no funciona? \n entonces llegó tu momento!! \n" + oferta);
        
    }
    
}
