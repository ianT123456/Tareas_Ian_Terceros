package EjerciciosFinalVisitor;

import java.util.Random;


public class ConcreteV implements IVisitor {
    @Override
    public void mantenimiento(Celular celular) {
        celular.showInfo();
        System.out.println("Marca: "+celular.getMarca());
        System.out.println("Modelo: "+celular.getModelo());
        System.out.println("Mantenimiento: preventivo");
        System.out.println();
    }

    @Override
    public void mantenimiento(Computadora computadora) {
        computadora.showInfo();
        Random random = new Random();
        int numRandom= random.nextInt(100)+1;
        if(numRandom%2==0){
            System.out.println("Mantenimiento: preventivo");
        }else{
            System.out.println("Mantenimiento: correctivo");
        }
        System.out.println();
    }

    @Override
    public void mantenimiento(Televisor televisor) {
        televisor.showInfo();
        System.out.println("Marca: "+televisor.getMarca());
        System.out.println("Resolucion: "+televisor.getResolucion());
        System.out.println("Tamaño: "+televisor.getTamano());
    }
}
