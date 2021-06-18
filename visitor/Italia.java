package visitor;

public class Italia implements IPais{

    private double enDolar = 1.19;
    private double dolarALocal = 0.84;


    public Italia(){}

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
