package visitor;

public class Client {
    public static void main(String  [] args ) {
        Bolivia bolivia = new Bolivia();
        Argentina argentina = new Argentina();
        Brasil brasil = new Brasil();
        Italia italia = new Italia();

        LibreCambista libreCambista = new LibreCambista();

        libreCambista.aDolar(bolivia, 100.00);
        libreCambista.aDolar(argentina, 100.00);
        libreCambista.aDolar(brasil, 100.00);
        libreCambista.aDolar(italia, 100.00);

        libreCambista.aLocal(bolivia, 100.00);
        libreCambista.aLocal(argentina, 100.00);
        libreCambista.aLocal(brasil, 100.00);
        libreCambista.aLocal(italia, 100.00);

    }   }