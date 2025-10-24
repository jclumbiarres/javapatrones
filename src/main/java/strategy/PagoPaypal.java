package strategy;

public class PagoPaypal implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con PayPal: $" + monto);
    }
}