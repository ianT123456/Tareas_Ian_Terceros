package EjerciciosFinalProxy;

public class Servidor implements IServidor {

    @Override
    public void ingresar(String usuario, String password) {
        System.out.println("Usuario en atencion: " + usuario);

    }

}