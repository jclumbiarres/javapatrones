package observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private final List<Observador> subs = new ArrayList<>();

    public void suscribir(Observador obs) {
        subs.add(obs);
    }

    public void notificar(String mensaje) {
        subs.forEach(o -> o.actualizar(mensaje));
    }
}
