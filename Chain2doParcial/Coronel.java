package Chain2doParcial;

public class Coronel implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito iejercito) {
        this.next = iejercito;

    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void accion(String accion) {
        if (accion.equals("Desbloqueos")) {
            System.out.println("Coronoel indica via expedita");
        } else if (accion.equals("Manifestaciones")) {
            System.out.println("Coronel desplegado");
        } else {
            this.next.accion(accion);
        }

    }

}
