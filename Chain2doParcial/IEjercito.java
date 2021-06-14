package Chain2doParcial;

public interface IEjercito {
    void setNext(IEjercito iejercito);
    IEjercito next();
    void accion (String accion);
}
