package adapter;

public class AdaptadorAmericano implements EnchufeEuropeo {
    private final EnchufeAmericano enchufe;

    public AdaptadorAmericano(EnchufeAmericano enchufe) {
        this.enchufe = enchufe;
    }

    @Override
    public void conectar() {
        enchufe.plugIn();
    }
}