package StrategyCelulares;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        TiendaCelular t = new TiendaCelular(3);

        List<Celular> p = new LinkedList<Celular>();

        p.add(new Celular("Galaxi","Samsung","Alta",100));
        p.add(new Celular("P20","Huawei","Alta",200));
        p.add(new Celular("X45","Samsung","Media",300));

        t.setList(p);

        t.bXmodelo("Galaxi");
        t.bXprecio(300);

        t.add(new Celular("SR2","Sony","Alta", 400));

        t.bXmodelo("SR2");
        t.bXprecio(400);
    }
}
