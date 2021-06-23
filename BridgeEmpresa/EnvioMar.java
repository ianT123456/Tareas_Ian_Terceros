package BridgeEmpresa;

public class EnvioMar implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("*enviado x mar");
        System.out.println("Costo: "+(paquete.getPrecio()*1.25));
    }
}
