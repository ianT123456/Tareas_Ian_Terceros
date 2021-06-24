package Proxy;

public class TarjetaDeDebito implements IBanco{
    @Override
    public void retiro(Cuenta cuenta) {
        if(cuenta.getTotal() >= cuenta.getValorTransaccion()){
            System.out.println("monto de transaccion: "+ cuenta.getValorTransaccion());
            System.out.println("total: "+(cuenta.getTotal()-cuenta.getValorTransaccion()));
            cuenta.showInfo();
        }else{
            System.out.println("insuficiente total en cuenta:");
            cuenta.showInfo();
        }
    }
}