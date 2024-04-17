public class OfertaElectronica implements ObservadorOferta{

    @Override
    public void recibirOferta(String oferta) {
        System.out.println("Aprobecha nustras ofertas en el departamento de Electronica: "+ oferta);
    }
}
