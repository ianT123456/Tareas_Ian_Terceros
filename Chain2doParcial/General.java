package Chain2doParcial;

public class General implements IEjercito {
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
        if (accion.equals("Entrevistas")) {
            System.out.println("En entrevista");
        } else {
            this.next.accion(accion);
        }

    }

}
