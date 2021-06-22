package Adapter;


public class Cliente {
    public static void main(String[] args) {
        IElectronicos2 celular = new Celular(" xiaomi", 1200, " 1 anos");
        IElectronicos2 tableta = new Tableta("apple taablet", 2200, "2 anos");
        IElectronicos2 computadora = new Computadora("Asus ROG", 3000, "3 anos");
        IElectronicos2 televisor = new ElectronicosAdapter(new Televisor("Ben Q", 200, "5 anos"));
        IElectronicos2 refrigerador = new ElectronicosAdapter(new Refrigerador("LG", 10000, "6 anos"));
        IElectronicos2 lavadora = new ElectronicosAdapter(new Lavadora("presta ", 2000, "6 anoss"));

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