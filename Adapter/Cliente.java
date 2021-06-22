package Adapter;


public class Cliente {
    public static void main(String[] args) {
        IElectronicos2 celular = new Celular("Samsung Galaxy", 100, "3 años");
        IElectronicos2 tableta = new Tableta("LG Tablet", 500, "4 años");
        IElectronicos2 computadora = new Computadora("Hp intel", 1000, "5 años");
        IElectronicos2 televisor = new ElectronicosAdapter(new Televisor("Sony", 1500, "1 año"));
        IElectronicos2 refrigerador = new ElectronicosAdapter(new Refrigerador("Frezeex", 5000, "3 años"));
        IElectronicos2 lavadora = new ElectronicosAdapter(new Lavadora("LG lavator", 3500, "2 años"));

        celular.precio();
        tableta.precio();
        computadora.precio();
        televisor.precio();
        refrigerador.precio();
        lavadora.precio();

        celular.tiempoDeVida();
        tableta.tiempoDeVida();
        computadora.tiempoDeVida();
        televisor.tiempoDeVida();
        refrigerador.tiempoDeVida();
        lavadora.tiempoDeVida();
    }
}