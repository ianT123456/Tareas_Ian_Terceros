package PresentacionEjercicios.TeTa;

public class destino {
    private String pais;
    private String ciudad;
    private String aeropuerto;
   public destino(){}

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
    public void print(){
        System.out.print("pais"+ pais);
        System.out.print("ciudad:"+ ciudad);
        System.out.print("aeropuert"+aeropuerto);
   }
}
