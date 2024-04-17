import java.util.ArrayList;
import java.util.List;

public class GestorOfertas {
    private static GestorOfertas instance = null;
    private List<ObservadorOferta> observadores;
    private String ofertaActual;

    public static GestorOfertas getInstance(){
        if (instance == null){
            instance = new GestorOfertas();
        }
        return instance;
    }

    public GestorOfertas() {
        observadores = new ArrayList<>();
    }

    public void suscribir(ObservadorOferta observador) {
        observadores.add(observador);
    }

    public void desuscribir(ObservadorOferta observador) {
        observadores.remove(observador);
    }

    public void notificarOferta(String oferta) {
        ofertaActual = oferta;
        for (ObservadorOferta observador : observadores) {
            observador.recibirOferta(oferta);
        }
    }
}