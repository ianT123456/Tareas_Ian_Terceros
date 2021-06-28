package EjerciciosFinalBridge;


public class TigoMoney implements IFormaPago {

    @Override
    public void pagar(double costo) {
        System.out.println("Costo total: " + (costo*0.98));

    }

}
