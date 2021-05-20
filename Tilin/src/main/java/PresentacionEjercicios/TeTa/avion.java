package PresentacionEjercicios.TeTa;

public class avion {
    private String marca;
    private String capacidad;
    private String numeroDeAsientos;
    public avion (){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(String numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }
    public void print (){
        System.out.print("marca"+ marca);
        System.out.print("capacidad"+ capacidad);
        System.out.print("nroAsientos"+numeroDeAsientos);
    }
}
