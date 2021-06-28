package EjerciciosFinalProxy;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor(), new Servidor());

        proxy.registrar("usuario1", "111");
        proxy.registrar("usuario2", "222");
        proxy.registrar("usuario3", "333");
        proxy.registrar("usuario4", "444");
        proxy.registrar("usuario5", "555");
        proxy.registrar("usuario6", "666");


        proxy.ingresar("usuario1", "111");
        proxy.ingresar("usuario2", "222");
        proxy.ingresar("usuario3", "333");
        proxy.ingresar("usuario4", "444");
        proxy.ingresar("usuario5", "555");
        proxy.ingresar("usuario6", "666");

    }

}
