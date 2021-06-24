package Proxy;


public class Cuenta {
    private int nroCuenta;
    private String moneda;
    private double valorTransaccion;
    private String nombre;
    private double total;

    public Cuenta( int nroCuenta, String nombre, String moneda, double total, double valorTransaccion){
        this.nroCuenta = nroCuenta;
        this.nombre=nombre;
        this.moneda =moneda;
        this.total =total;
        this.valorTransaccion =valorTransaccion;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(double valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public void showInfo(){
        System.out.println("Nro cuenta: "+ nroCuenta);
        System.out.println("moneda: "+ moneda);
        System.out.println("total: "+ total);
        System.out.println("valor total: "+ valorTransaccion);
    }
}