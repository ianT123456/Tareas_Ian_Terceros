package PresentacionEjercicios.TeTa ;

public class creadorPasajeEstandar extends creadorDePasajes {
    @Override
    public IPasaje create() {
        avion avion=new avion();
        avion.setCapacidad("70 toneladas");
        avion.setMarca("cmarmol");
        avion.setNumeroDeAsientos("400");

        destino destino=new destino();
        destino.setCiudad("Senpai");
        destino.setAeropuerto("Aeropuerto de Onichan");
        destino.setPais("Slovenia");

        origen origen=new origen();
        origen.setCiudad("La Paz");
        origen.setAeropuerto("El Alto");
        origen.setPais("Bolivia");

        pasajero pasajero=new pasajero();
        pasajero.setNombre("Esternocleidomasotideo");
        pasajero.setCi("545454");

        PasajeStandart PasajeStandart=new PasajeStandart();
        PasajeStandart.setNumeroVuelo("2344324");
        PasajeStandart.setDestino(destino);
        PasajeStandart.setOrigen(origen);
        PasajeStandart.setAvion(avion);
        PasajeStandart.setPasajero(pasajero);
        PasajeStandart.setNumeroDeAsiento("345");
        PasajeStandart.setCostoDePasaje("600$");


        return PasajeStandart;
    }
}
