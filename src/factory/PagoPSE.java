package factory;

public class PagoPSE implements Pago{

    @Override
    public void crearPago() {
        System.out.println("Se ha procesado pago con PSE");
    }
    
}
