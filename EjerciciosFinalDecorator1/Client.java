package EjerciciosFinalDecorator1;

public class Client {

    public static void main(String[] args) {
        IPersonaje personaje = new Personaje("Tilin");
        personaje.info();

        personaje = new Equipar(personaje, "Escopeta");
        personaje.info();

        personaje = new Escudo(personaje);
        personaje.info();

        personaje = new Pocion(personaje);
        personaje.info();





    }

}
