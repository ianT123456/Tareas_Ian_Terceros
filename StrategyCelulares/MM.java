package StrategyCelulares;

import java.util.List;

public class MM implements IM {

    @Override
    public void PrecioLookUp(List<Celular> list, String modelo) {
        System.out.println("srgun modelo: "+modelo);
        for (Celular c : list) {
            if (c.getModelo().equals(modelo)) {
                c.showInfo();
            }
        }

    }

}
