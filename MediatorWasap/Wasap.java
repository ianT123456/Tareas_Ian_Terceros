package MediatorWasap;

import java.util.LinkedList;
import java.util.List;

public class Wasap implements CanalDeComunicacion{

    private List<UsersGroup> grupos = new LinkedList<UsersGroup>();

    public void addGrupo(UsersGroup grupo) {
        grupos.add(grupo);
    }
    @Override
    public void send(String message, User usuario) {
        usuario.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nombreGrupo, User origen) {
        UsersGroup grupoActual = new UsersGroup("Panas");
        for (UsersGroup grupoUsuarios : grupos) {
            if(grupoUsuarios.getNombre().equals(nombreGrupo)) {
                grupoActual=grupoUsuarios;
                break;
            }
        }
        for (User usuario : grupoActual.getGrupo()) {
            if(!usuario.equals(origen)) {
                usuario.messageReceived(message);
            }
        }
    }


}
