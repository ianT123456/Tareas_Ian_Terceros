package PresentacionEjercicios.TeTa;

public class creadorPasajeInfante extends creadorDePasajes {
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

        PasajeInfante PasajeInfante=new PasajeInfante();
        PasajeInfante.setNumeroVuelo("2344324");
        PasajeInfante.setDestino(destino);
        PasajeInfante.setOrigen(origen);
        PasajeInfante.setAvion(avion);
        PasajeInfante.setPasajero(pasajero);
        PasajeInfante.setNumeroDeAsiento("345");
        PasajeInfante.getCostoEspecial("123");

        return PasajeInfante;
    }
}
