package Chain2doParcial;

public class Teniente implements IEjercito{
    private IEjercito next;

    @Override
    public void setNext(IEjercito iejercito) {
        this.next=iejercito;

    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void accion(String accion) {
        if(accion.equals("Flajelo correspondiente")) {
            System.out.println("Sometiendo");
        }else {
            this.next.accion(accion);
        }

    }


}
