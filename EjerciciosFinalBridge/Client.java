package EjerciciosFinalBridge;

public class Client {

    public static void main(String[] args) {
        Instalacion ins1 = new InstalacionAgua("Tilin", 1, new Efectivo());
        Instalacion ins2 = new InstalacionAgua("Tilin", 1, new Transferencia());
        Instalacion ins3 = new InstalacionAgua("Tilin", 1, new TigoMoney());
        Instalacion ins4 = new InstalacionAgua("Tilin", 1, new App());

        ins1.pagar();
        ins2.pagar();
        ins3.pagar();
        ins4.pagar();


        Instalacion ial1 = new InstalacionAlcantarillado("Esternocleidomastoideo", 2, new Efectivo());
        Instalacion ial2 = new InstalacionAlcantarillado("Esternocleidomastoideo", 2, new Transferencia());
        Instalacion ial3 = new InstalacionAlcantarillado("Esternocleidomastoideo", 2, new TigoMoney());
        Instalacion ial4 = new InstalacionAlcantarillado("Esternocleidomastoideo", 2, new App());

        ial1.pagar();
        ial2.pagar();
        ial3.pagar();
        ial4.pagar();

        Instalacion ie1 = new InstalacionElectrica("Senpai", 3, new Efectivo());
        Instalacion ie2 = new InstalacionElectrica("Senpai", 3, new Transferencia());
        Instalacion ie3 = new InstalacionElectrica("Senpai", 3, new TigoMoney());
        Instalacion ie4 = new InstalacionElectrica("Senpai", 3, new App());

        ie1.pagar();
        ie2.pagar();
        ie3.pagar();
        ie4.pagar();

    }

}
