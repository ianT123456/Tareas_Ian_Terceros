package MediatorWasap;

public class UsuarioWasap extends User {
    private String nombre;

    public UsuarioWasap(CanalDeComunicacion mediator, String nombre) {
        super(mediator);
        this.nombre=nombre;
    }

    @Override
    public void messageReceived(String message) {
        System.out.println(nombre + " Mensaje recibido: ");
        System.out.println(message);

    }

    @Override
    public void sendPerson(String message, User destino) {
        mediator.send(message, destino);

    }

    @Override
    public void sendGroup(String message, String grupo) {
        mediator.sendGroup(message, grupo, this);

    }

}