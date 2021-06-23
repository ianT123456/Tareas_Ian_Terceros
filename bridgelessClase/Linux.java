package bridgelessClase;

public class Linux implements IPlataforma{

    public void showInfo(){
        System.out.println();
        System.out.println("Sistema: Linux");
    }
    @Override
    public void arq86() {
        showInfo();
        System.out.println("Arquitectura: x86 bit");
    }

    @Override
    public void arq64() {
        showInfo();
        System.out.println("Arquitectura :x64 bit");
    }
}
