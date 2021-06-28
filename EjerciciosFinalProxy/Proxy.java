package EjerciciosFinalProxy;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements IServidor {
    List<Usuario> usuarios;
    IServidor servidor1;
    IServidor servidor2;
    int nroUsuarios;

    public Proxy(IServidor servidor1, IServidor servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        nroUsuarios = 0;
    }

    public void registrar(String usuario, String contrasena) {
        nroUsuarios++;
        usuarios.add(new Usuario(nroUsuarios, usuario, contrasena));
    }

    @Override
    public void ingresar(String usuario, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                if (u.getContrasena().equals(password)) {
                    if (u.id % 2 == 0) {
                        System.out.println("Servidor 2 en uso");
                        servidor2.ingresar(usuario, password);
                    } else {
                        System.out.println("Servidor 1 en uso");
                        servidor1.ingresar(usuario, password);
                    }
                } else {
                    System.out.println("Contrasena incorrecta");
                }
            }
        }

    }

}