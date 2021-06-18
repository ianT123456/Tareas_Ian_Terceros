package visitor;

public class Brasil implements  IPais{

    private double enDolar = 0.20;
    private double dolarALocal = 5.01;

    public Brasil(){}


    public double getEnDolar() {
        return enDolar;
    }

    public void setEnDolar(double enDolar) {
        this.enDolar = enDolar;
    }

    public double getDolarALocal() {
        return dolarALocal;
    }

    public void setDolarALocal(double dolarALocal) {
        this.dolarALocal = dolarALocal;
    }

    @Override
    public void accept(ILibreCambista libreCambista) {

    }
}