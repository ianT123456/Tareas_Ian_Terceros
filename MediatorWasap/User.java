package MediatorWasap;

public abstract class User {
    protected CanalDeComunicacion mediator;

    public User(CanalDeComunicacion mediator){
        this.mediator=mediator;
    }

    public abstract void sendPerson(String message, User destino);

    public abstract void sendGroup(String message,String grupo);


    public abstract void messageReceived(String message);
}
