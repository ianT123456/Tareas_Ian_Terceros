package StrategyCelulares;

import java.util.List;

public class PM implements IM {

    @Override
    public void PrecioLookUp(List<Celular> list, String modelo) {
        System.out.println("Srgun modelo : " + modelo);
        for (Celular c : list) {
            if (c.getModelo().equals(modelo)) {
                c.showInfo();
            }
        }

    }

}