package Main;

import adapter.AdaptadorAmericano;
import adapter.EnchufeAmericano;
import adapter.EnchufeEuropeo;
import builder.Usuario;
import decorator.Notificador;
import decorator.NotificadorBasico;
import decorator.NotificadorEmail;
import factory.Transporte;
import factory.TransporteFactory;
import observer.Canal;
import observer.UsuarioObservador;
import singleton.Configuracion;
import strategy.Carrito;
import strategy.PagoPaypal;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== 🧱 Singleton ===");
        Configuracion.getInstance().mostrarConfig();

        System.out.println("\n=== 🧰 Factory ===");
        Transporte coche = TransporteFactory.crear("coche");
        System.out.println(coche);

        System.out.println("\n=== 🧩 Builder ===");
        Usuario usuario = new Usuario.Builder()
                .nombre("Lucía")
                .edad(28)
                .email("lucia@example.com")
                .build();
        System.out.println(usuario);

        System.out.println("\n=== ⚡ Adapter ===");
        EnchufeEuropeo enchufe = new AdaptadorAmericano(new EnchufeAmericano());
        enchufe.conectar();

        System.out.println("\n=== 🎨 Decorator ===");
        Notificador notificador = new NotificadorEmail(new NotificadorBasico());
        notificador.enviar("Mensaje de bienvenida!");

        System.out.println("\n=== ⚙️ Strategy ===");
        Carrito carrito = new Carrito();
        carrito.setEstrategia(new PagoPaypal());
        carrito.pagar(100.0);

        System.out.println("\n=== 🔔 Observer ===");
        Canal canal = new Canal();
        canal.suscribir(new UsuarioObservador("Carlos"));
        canal.suscribir(new UsuarioObservador("Ana"));
        canal.notificar("Nuevo video disponible!");
    }
}
