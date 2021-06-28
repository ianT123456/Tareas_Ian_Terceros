package EjerciciosFinalVisitor;

public class Computadora implements IArtefactos {
    @Override
    public void showInfo() {
        System.out.println("PC");
    }

    @Override
    public void mantener(IVisitor visitor) {
        visitor.mantenimiento(this);
    }

}