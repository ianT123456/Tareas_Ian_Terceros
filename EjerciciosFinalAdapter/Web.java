package EjerciciosFinalAdapter;

public class Web implements AppPC {

    @Override
    public void iniciarSesion() {
        System.out.println("iniciando sesion en web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("cerrando sesion en web");

    }

    @Override
    public void generarDatos() {
        System.out.println("generando datos en web");

    }

}