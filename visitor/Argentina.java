package visitor;

public class Argentina implements IPais{


    private double enDolar = 0.010;
    private double dolarALocal = 95.36;

    public Argentina(){}


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