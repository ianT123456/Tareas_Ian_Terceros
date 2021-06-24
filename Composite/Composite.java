package Composite;


import java.util.ArrayList;
import java.util.List;


public class Composite extends Componente {

    private List<Componente> list = new ArrayList<>();
    private int compraTotal =0;

    public Composite(String titulo) {
        super(titulo);
    }


    @Override
    public int compraTotal() {

        for (Componente componente:list ) {
            compraTotal = compraTotal +componente.compraTotal();
        }
        System.out.println("Componente :"+ getNombre()+" valor final :" + compraTotal );
        return compraTotal;
    }

    @Override
    public void add(Componente component) {
        list.add(component);
    }

    @Override
    public void remove(Componente component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getNombre());
    }
}
