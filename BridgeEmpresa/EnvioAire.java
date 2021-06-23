package BridgeEmpresa;

public class EnvioAire implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("enviado x aire");
        System.out.println("Costo: "+(paquete.getPrecio()*1.1));
    }
}
