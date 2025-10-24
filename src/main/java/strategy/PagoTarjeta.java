package strategy;

public class PagoTarjeta implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta: $" + monto);
    }
}