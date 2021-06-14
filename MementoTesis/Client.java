package MementoTesis;


public class Client {
    public static void main(String[] args) {
        Versiones versiones = new Versiones();
        Originator originator = new Originator();

        Tesis t;
        t = new Tesis("90/5/1999", "opopopop");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("22/10/1999", "yuiyuiyui");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("22/7/2000", "alnlanaln");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("30/9/1999", "xdfvvfdxxdfv");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        t = new Tesis("2/1/1999", "gfdgfdgfd");
        originator.setState(t);
        versiones.addMemento(originator.createVersion());

        originator.restoreFromMemento(versiones.getVersion(2));

    }
}