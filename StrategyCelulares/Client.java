package StrategyCelulares;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        TiendaCelular t = new TiendaCelular(3);

        List<Celular> p = new LinkedList<Celular>();

        p.add(new Celular("Ifone","apple","alta",123));
        p.add(new Celular("Xperia","Sony","alta",321));
        p.add(new Celular("a21","Samsung","alta",111));

        t.setList(p);

        t.bXmodelo("Ifone");
        t.bXprecio(123);

        t.add(new Celular("Tilin","HTC","alta", 555));

        t.bXmodelo("Tilin");
        t.bXprecio(555);
    }
}
