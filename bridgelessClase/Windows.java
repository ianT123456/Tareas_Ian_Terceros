package bridgelessClase;

public class Windows implements IPlataforma{

    public void showInfo(){
        System.out.println("Sistema: Windows");
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
