package AbstractMethod.AbstractFactory;

public class HeladoCrema implements IHelado {

    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    private Crema crema = new Crema();

    public HeladoCrema(){}

    @Override
    public void crear() {
        System.out.println("Helado De Crema - tamano: "+tamano);
        System.out.println("Helado De Crema - forma: "+forma);
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
}
