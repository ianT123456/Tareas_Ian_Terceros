package PresentacionEjercicios.TeTa;

public class Cliente {
    public  static void main (String[]args){
        creadorDePasajes pasajeStandar=new creadorPasajeEstandar();
        pasajeStandar.create().crear();

        creadorDePasajes pasajeSolidario=new creadorPasajeSolidario();
        pasajeSolidario.create().crear();

        creadorDePasajes pasajeInfantes=new creadorPasajeInfante();
        pasajeInfantes.create().crear();




    }
}