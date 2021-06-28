package EjerciciosFinalBridge;


public class App implements IFormaPago {

    @Override
    public void pagar(double costo) {
        System.out.println("Costo total: " + (costo*0.9));

    }

}