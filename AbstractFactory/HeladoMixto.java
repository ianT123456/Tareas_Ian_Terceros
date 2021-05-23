package AbstractMethod.AbstractFactory;

public class HeladoMixto implements IHelado {

    private String tamano;
    private String forma;
    private Fruta fruta;
    private Crema crema;
    private String costo;

    public HeladoMixto(){
        fruta = new Fruta();
        crema = new Crema();
    }

    @Override
    public void crear() {
        System.out.println("Helado Mixto - tamano: "+tamano);
        System.out.println("Helado Mixto - forma: "+forma);
        System.out.println("Helado Mixto - costo: "+costo);

        fruta.showInfo();
        crema.showInfo();
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
