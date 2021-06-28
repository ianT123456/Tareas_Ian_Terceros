package EjerciciosFinalComposite;

public class Client {

    public static void main(String[] args) {
        Documento a1 = new Archivo("q pex");
        Documento a2 = new Archivo("tudo bom");
        Documento a3 = new Archivo(" 1 2 ");

        a1.MostrarPalabras();

        Documento a4 = new Archivo("oni chan");
        Documento a5 = new Archivo("o senpai");
        Documento a6 = new Archivo("de besth ");

        a4.MostrarPalabras();

        Documento folder1 = new Contenedor();

        folder1.add(a1);
        folder1.add(a2);
        folder1.add(a3);

        folder1.MostrarPalabras();

        Documento folder2 = new Contenedor();

        folder2.add(a4);
        folder2.add(a5);
        folder2.add(a6);

        folder2.MostrarPalabras();

        Documento unidadDisco = new Contenedor();

        unidadDisco.add(folder1);
        unidadDisco.add(folder2);

        unidadDisco.MostrarPalabras();
    }

}
