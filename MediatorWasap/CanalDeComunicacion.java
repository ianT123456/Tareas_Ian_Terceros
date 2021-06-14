package MediatorWasap;

public interface CanalDeComunicacion {
    void send( String message, User usuario);
    void sendGroup(String message, String nombreGrupo, User Origen);

}