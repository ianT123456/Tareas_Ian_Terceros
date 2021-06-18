package visitor;

public class LibreCambista implements ILibreCambista{
    @Override
    public void aDolar(Bolivia bolivia, double cambio) {
        System.out.println("cambio "+cambio+" bs a dolar");
        System.out.println(bolivia.getEnDolar()*cambio+" dolar");

    }

    @Override
    public void aDolar(Argentina argentina, double cambio) {

        System.out.println("cambio "+cambio+" pesos argentinos a dolar");
        System.out.println(argentina.getEnDolar()*cambio+" dolar");
    }

    @Override
    public void aDolar(Italia italia, double cambio) {

        System.out.println("ca,bio "+cambio+" euros a dolar");
        System.out.println(italia.getEnDolar()*cambio+" dolar");
    }

    @Override
    public void aDolar(Brasil brasil, double cambio) {

        System.out.println("cambio "+cambio+" real a dolar");
        System.out.println(brasil.getEnDolar()*cambio+" dolar");
    }

    @Override
    public void aLocal(Bolivia bolivia, double cambio) {

        System.out.println("cambio "+cambio+" dolar a bs");
        System.out.println(bolivia.getDolarALocal()*cambio+" bs");
    }

    @Override
    public void aLocal(Argentina argentina, double cambio) {

        System.out.println("cambio"+cambio+" de dolar a pesos argentinos");
        System.out.println(argentina.getDolarALocal()*cambio+" pesos argentinos");
    }

    @Override
    public void aLocal(Italia italia, double cambio) {

        System.out.println("cambio "+cambio+" de dolar a euro");
        System.out.println(italia.getDolarALocal()*cambio+" euros");
    }

    @Override
    public void aLocal(Brasil brasil, double cambio) {

        System.out.println("cambio "+cambio+" de dolar  a reales  ");
        System.out.println(brasil.getDolarALocal()*cambio+" reales ");
    }
}