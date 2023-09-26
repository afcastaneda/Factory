package factory;

public class Factory {

    public static void main(String[] args) {
        PagoFactory pagoFactory = new MiPagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoDePago.PAYPAL);
        pago.crearPago();
    }
    
}
