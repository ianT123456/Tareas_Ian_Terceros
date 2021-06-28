package EjerciciosFinalVisitor;

public class Televisor implements IArtefactos {
    private String marca;
    private String resolucion;
    private String tamano;

    public Televisor(String marca, String tamano, String resolucion) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tamano = tamano;
    }

    @Override
    public void showInfo() {
        System.out.println("TV");
    }

    @Override
    public void mantener(IVisitor visitor) {
        visitor.mantenimiento(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }


}
