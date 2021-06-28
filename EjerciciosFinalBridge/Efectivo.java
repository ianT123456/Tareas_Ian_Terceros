package EjerciciosFinalBridge;

public class Efectivo implements IFormaPago {

    @Override
    public void pagar(double costo) {
        System.out.println("Costo total: " + costo);

    }

}