package Chain2doParcial;

public class Cabo implements IEjercito {
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
        if (accion.equals("Limpieza")) {
            System.out.println("En limpieza");
        } else {
            System.out.println("Realiza la tarea");
        }

    }

}