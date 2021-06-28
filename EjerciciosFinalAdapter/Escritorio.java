package EjerciciosFinalAdapter;

public class Escritorio implements AppPC {

    @Override
    public void iniciarSesion() {
        System.out.println("iniciando seseion en escritorio...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando seseion en escritorio");

    }

    @Override
    public void generarDatos() {
        System.out.println("Generando datos en escritorio");

    }

}