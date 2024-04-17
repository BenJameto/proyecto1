public class OfertaAlimentos implements ObservadorOferta{

    @Override
    public void recibirOferta(String oferta) {
        System.out.println("Moriras de Amsiedad pero no de hambre!! \n" + oferta);
    }
    
}
