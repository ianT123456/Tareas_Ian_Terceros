package bridgeEnClase;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println();
        System.out.println("SO: Windows");
        arquitectura.arquitectura();
    }
}
