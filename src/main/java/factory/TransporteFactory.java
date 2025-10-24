package factory;


public class TransporteFactory {
    public static Transporte crear(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "coche" -> new Coche();
            case "moto" -> new Moto();
            default -> throw new IllegalArgumentException("Tipo de transporte no válido");
        };
    }
}