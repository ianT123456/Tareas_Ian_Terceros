package BridgeEmpresa;

public class EnvioTierra implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("enviado x tierra");
        System.out.println("Costo: "+(paquete.getPrecio()*1.05));
    }
}