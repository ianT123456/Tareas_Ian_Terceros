package Adapter;


public class ElectronicosAdapter implements IElectronicos2 {
    IElectronicos1 electronicos1;


    public ElectronicosAdapter(IElectronicos1 electronicos1) {
        this.electronicos1 = electronicos1;
    }

    @Override
    public void precio() {
        System.out.println("adaptando costo a precio:");
        electronicos1.costo();

    }

    @Override
    public void tiempoDeVida() {
        System.out.println("tiempo de garantía equivale al tiempo de vida");
        electronicos1.tiempoDeGarantia();
    }

}