package BridgeEmpresa;

public class Client {
    public static void main(String[] args){
        EmpresaSRL e1 =new EmpresaSRL(new Paquete(1000, "parlante bose"),new EnvioAire());
        e1.enviarPaquete();

        EmpresaSRL e2 =new EmpresaSRL(new Paquete(1300, "ipnohe 12"),new EnvioTierra());
        e2.enviarPaquete();

        EmpresaSRL e3 =new EmpresaSRL(new Paquete(100, "pasankalla"),new EnvioMar());
        e3.enviarPaquete();

        EmpresaSA e4 =new EmpresaSA(new Paquete(6000, "nviagtx 370"),new EnvioAire());
        e4.enviarPaquete();

        EmpresaSA e5 =new EmpresaSA(new Paquete(10000, "intel core i9"),new EnvioTierra());
        e5.enviarPaquete();

        EmpresaSA e6 =new EmpresaSA(new Paquete(123, "tilin"),new EnvioMar());
        e6.enviarPaquete();
    }
}
