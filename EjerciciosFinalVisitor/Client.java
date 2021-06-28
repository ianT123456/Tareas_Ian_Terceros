package EjerciciosFinalVisitor;

public class Client {
    public static void main(String[] args){
        Celular celular = new Celular("Samsung", "J2 prime");
        Computadora computadora = new Computadora();
        Televisor televisor = new Televisor("Panasonic", "15'", "4k");

        ConcreteV concreteVisitor= new ConcreteV();
        celular.mantener(concreteVisitor);
        computadora.mantener(concreteVisitor);
        televisor.mantener(concreteVisitor);
    }
}