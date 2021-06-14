package MementoTesis;

public class Originator {
    private Tesis state;

    public void setState(Tesis state) {
        System.out.println("Estado");
        state.showInfo();
        this.state = state;
    }

    public VersionTesis createVersion(){
        System.out.println("Crear");
        state.showInfo();;
        return new VersionTesis(this.state) ;
    }

    public void restoreFromMemento(VersionTesis version){
        this.state=version.getState();
        System.out.println("Restaurar");
        this.state.showInfo();
    }
}