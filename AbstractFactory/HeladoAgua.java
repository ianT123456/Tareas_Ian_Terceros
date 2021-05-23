package AbstractMethod.AbstractFactory;

public class HeladoAgua implements IHelado {

    private String tamano;
    private String forma;
    private Fruta fruta = new Fruta();
    public HeladoAgua(){

    }

    @Override
    public void crear() {
        System.out.println("Helado De Agua - tamano: "+tamano);
        System.out.println("Helado De Agua - forma: "+forma);
        fruta.showInfo();
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

}
