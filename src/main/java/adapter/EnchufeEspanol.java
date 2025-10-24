package adapter;

public class EnchufeEspanol implements EnchufeEuropeo {
    @Override
    public void conectar() {
        System.out.println("Conectado al enchufe español 🇪🇸");
    }
}