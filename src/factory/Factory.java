package factory;

public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        Pago pago = pagoFactory.obtenerPago(TipoDePago.NEQUI);
        pago.crearPago();
    }
    
}
