package PresentacionEjercicios.TeTa;

public class creadorPasajeSolidario extends creadorDePasajes{
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

        PasajeSolidario PasajeSolidario=new PasajeSolidario();
        PasajeSolidario.setNumeroVuelo("2344324");
        PasajeSolidario.setDestino(destino);
        PasajeSolidario.setOrigen(origen);
        PasajeSolidario.setAvion(avion);
        PasajeSolidario.setPasajero(pasajero);
        PasajeSolidario.setNumeroDeAsiento("345");
        PasajeSolidario.setCostoDePasaje("600$");
        PasajeSolidario.setDescuento("50%");
        PasajeSolidario.setMotivoDeDescuento("Discapacidad");


        return PasajeSolidario;
    }
}
