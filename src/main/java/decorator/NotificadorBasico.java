package decorator;

public class NotificadorBasico implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificando: " + mensaje);
    }
}