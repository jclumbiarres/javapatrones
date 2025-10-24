package decorator;

public class NotificadorEmail implements Notificador {
    private final Notificador wrappee;

    public NotificadorEmail(Notificador wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
        System.out.println("...enviando también por Email 📧");
    }
}
