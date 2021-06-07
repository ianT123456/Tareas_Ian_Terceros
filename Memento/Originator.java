package Memento;

public class Originator {
    private BackUp state;

    public Originator(){}

    public void setState(BackUp state) {
        System.out.println("Set State");
        state.showInfo();
        this.state = state;
    }

    public Memento createBackUp(){
        System.out.println("Create State");
        state.showInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("State Restored");
        this.state.showInfo();
    }

}
