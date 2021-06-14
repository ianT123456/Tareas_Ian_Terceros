package MediatorWasap;

import java.util.LinkedList;
import java.util.List;

public class UsersGroup {
    List<User> grupo = new LinkedList<>();
    String nombre;

    public UsersGroup(String nombre) {
        this.nombre = nombre;
    }

    public List<User> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<User> grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}