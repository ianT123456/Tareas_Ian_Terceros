package Proxy;


public class Proxy implements IBanco{
    private TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito();

    @Override
    public void retiro(Cuenta cuenta) {
        if(cuenta.getMoneda().equals("Bs")){
            tarjetaDeDebito.retiro(cuenta);
        }else if(cuenta.getMoneda().equals("Esloveno")) {
            cuenta.setValorTransaccion(cuenta.getValorTransaccion() * 4.33);
            cuenta.setMoneda("Bs");
            tarjetaDeDebito.retiro(cuenta);

        }
    }
}
