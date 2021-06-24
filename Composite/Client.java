package Composite;


public class Client {
    public static void main (String[] args){
        ComputadoraComposite cpu1 = new ComputadoraComposite("Componente1");
        ComputadoraComposite cpu2 = new ComputadoraComposite("Componente2");

        cpu1.setPrecio(1);
        cpu2.setPrecio(2);

        Composite laboratorio1 =new Composite("Laboratorio 1");
        laboratorio1.add(cpu1);
        laboratorio1.add(cpu2);

        Composite laboratorio2 =new Composite("Laboratorio 2");
        laboratorio2.add(cpu1);
        laboratorio2.add(cpu2);


        Composite contenedor1 = new Composite("Contenedor 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor1.compraTotal();
    }

}