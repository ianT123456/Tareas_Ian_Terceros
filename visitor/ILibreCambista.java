package visitor;

public interface ILibreCambista {

    void aDolar(Bolivia bolivia, double cambio);
    void aDolar(Argentina argentina, double cambio);
    void aDolar(Brasil brasil, double cambio);
    void aDolar(Italia italia, double cambio);

    void aLocal(Bolivia bolivia, double cambio);
    void aLocal(Argentina argentina, double cambio);
    void aLocal(Brasil brasil, double cambio);
    void aLocal(Italia italia, double cambio);
}