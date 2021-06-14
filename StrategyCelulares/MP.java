package StrategyCelulares;

import java.util.List;

public class MP implements IP {

    @Override
    public void PrecioLookUp(List<Celular> list, int precio) {
        System.out.println("Listando por precio: "+precio);
        for (Celular c : list) {
            if (c.getPrecio() == precio) {
                c.showInfo();
            }
        }

    }

}
