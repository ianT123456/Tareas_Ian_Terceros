package StrategyCelulares;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelular {
    private IM bm;
    private IP bp;
    private int value;
    private List<Celular> list = new LinkedList<Celular>();


    public TiendaCelular(int value) {
        this.value = value;
    }

    public void add(Celular c) {
        list.add(c);
    }
    public IM getBm() {
        return bm;
    }

    public void setBm(IM bm) {
        this.bm = bm;
    }

    public IP getBp() {
        return bp;
    }

    public void setBp(IP bp) {
        this.bp = bp;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<Celular> getList() {
        return list;
    }

    public void setList(List<Celular> list) {
        this.list = list;
    }

    public void bXprecio(int precio) {
        if(list.size()>value) {
            bp = new MP();
        }else {
            bp = new PP();
        }
        bp.PrecioLookUp(list, precio);
    }

    public void bXmodelo(String modelo) {
        if(list.size()>value) {
            bm = new MM();
        }else {
            bm = new PM();
        }
        bm.PrecioLookUp(list, modelo);
    }
}