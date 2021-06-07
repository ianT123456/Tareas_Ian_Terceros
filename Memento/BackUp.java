package Memento;

import java.util.LinkedList;
import java.util.List;

public class BackUp {
    String backUpList;
    List<Persona> entidad;

    public BackUp() {
        entidad =new LinkedList<Persona>();
    }
    public BackUp(String name, List dataBase) {
        this.backUpList =name;
        this.entidad =dataBase;
    }
    public String getBackUp() {
        return backUpList;
    }

    public void setBackUp(String backUp) {
        this.backUpList = backUp;
    }

    public List<Persona> getBaseDeDatos() {
        return entidad;
    }

    public void setBaseDeDatos(List<Persona> baseDeDatos) {
        this.entidad = baseDeDatos;
    }

    public void showInfo() {
        System.out.println("Alias BackUp: "+ backUpList);
        System.out.println("");
        for(Persona p: entidad) {
            p.info();
        }
    }
}