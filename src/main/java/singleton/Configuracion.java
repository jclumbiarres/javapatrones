package singleton;

public class Configuracion {
    private static final Configuracion INSTANCE = new Configuracion();

    private Configuracion() {}

    public static Configuracion getInstance() {
        return INSTANCE;
    }

    public void mostrarConfig() {
        System.out.println("Configuración del sistema cargada correctamente.");
    }
}
