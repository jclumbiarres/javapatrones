package observer;

public class UsuarioObservador implements Observador {
    private final String nombre;

    public UsuarioObservador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}
