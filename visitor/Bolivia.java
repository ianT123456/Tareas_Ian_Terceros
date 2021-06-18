package visitor;

public class Bolivia implements IPais{

    private double enDolar =0.14;
    private double dolarALocal =6.96;

    public Bolivia(){}


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
