package PresentacionEjercicios.TeTa;

public class pasajero {
    private String nombre;
    private String ci;
    public pasajero(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void print(){
        System.out.print("Nombre"+ nombre);
        System.out.print("ci:"+ ci);

    }
}
