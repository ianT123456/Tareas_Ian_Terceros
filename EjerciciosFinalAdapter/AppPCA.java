package EjerciciosFinalAdapter;

public class AppPCA implements AppCel {
    private AppPC appC;

    public AppPCA(AppPC appC) {
        System.out.println("Adaptando de PC a cel");
        this.appC = appC;
    }

    @Override
    public void login() {
        appC.iniciarSesion();
    }

    @Override
    public void logout() {
        appC.cerrarSesion();

    }

    @Override
    public void reportes() {
        appC.generarDatos();

    }

}
