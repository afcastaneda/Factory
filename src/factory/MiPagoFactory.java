package factory;

public class PagoFactory {

    public Pago obtenerPago(TipoDePago tipoDePago) {
        
        switch (tipoDePago) {
        case NEQUI -> {
            return new PagoNequi();
            }
        case PSE -> {
            return new PagoPSE();
            }
        default -> throw new IllegalArgumentException("Tipo de pago no válido " + tipoDePago);
}

    }
}
