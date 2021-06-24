package Composite;

public class ComputadoraComposite extends Componente {


    public ComputadoraComposite(String nombre) {
        super(nombre);
    }

    @Override
    public int compraTotal() {
        System.out.println("Componente : ["+ getNombre()+"  precio final : " + getPrecio()+"]");
        return this.getPrecio();
    }

    @Override
    public void add(Componente component) {
        System.out.println("imposible");
    }

    @Override
    public void remove(Componente component) {
        System.out.println("imposible");
    }

    @Override
    public void getChild(int position) {
        System.out.println("imposible");
    }
}
