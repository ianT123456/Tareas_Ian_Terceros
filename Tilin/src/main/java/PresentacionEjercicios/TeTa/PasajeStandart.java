package PresentacionEjercicios.TeTa;

public class PasajeStandart implements IPasaje {
    private String numeroVuelo;
    private destino destino;
    private origen origen;
    private avion avion;
    private pasajero pasajero;
    private String numeroDeAsiento;
    private String costoDePasaje;

    public PasajeStandart(){
        destino = new destino();
        origen = new origen();
        avion = new avion();
        pasajero = new pasajero();

    }

    @Override
    public void crear() {
        System.out.println("pasasje estandar, nro de asiento"+ numeroDeAsiento);
        System.out.println("nuro de vuelo"+ numeroVuelo);
        System.out.println("costo de pasaje"+ costoDePasaje);
        destino.print();
        origen.print();
        avion.print();
        pasajero.print();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public PresentacionEjercicios.TeTa.destino getDestino() {
        return destino;
    }

    public void setDestino(PresentacionEjercicios.TeTa.destino destino) {
        this.destino = destino;
    }

    public PresentacionEjercicios.TeTa.origen getOrigen() {
        return origen;
    }

    public void setOrigen(PresentacionEjercicios.TeTa.origen origen) {
        this.origen = origen;
    }

    public PresentacionEjercicios.TeTa.avion getAvion() {
        return avion;
    }

    public void setAvion(PresentacionEjercicios.TeTa.avion avion) {
        this.avion = avion;
    }

    public PresentacionEjercicios.TeTa.pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(PresentacionEjercicios.TeTa.pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(String numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public String getCostoDePasaje() {
        return costoDePasaje;
    }

    public void setCostoDePasaje(String costoDePasaje) {
        this.costoDePasaje = costoDePasaje;
    }
}
