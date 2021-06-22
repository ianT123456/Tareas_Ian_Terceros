package Adapter;

public class Computadora implements IElectronicos2 {
    private String tiempoDeVida;
    private String modelo;
    private int precio;

    public Computadora(String modelo, int precio, String tiempoDeVida) {
        this.modelo = modelo;
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(String tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {
        System.out.println("precio PC: " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("tiempo de vida PC: " + tiempoDeVida);
    }

}
