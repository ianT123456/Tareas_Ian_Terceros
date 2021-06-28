package EjerciciosFinalComposite;

import java.util.LinkedList;
import java.util.List;

public class Contenedor extends Documento {
    List<Documento> documentos;

    public Contenedor() {
        documentos = new LinkedList<Documento>();
    }

    @Override
    public int getNroPalabras() {
        int p = 0;
        for (Documento archivo : documentos) {
            p += archivo.getNroPalabras();
        }
        palabras = p;
        return p;
    }

    @Override
    public void MostrarPalabras() {
        this.getNroPalabras();
        System.out.println("Nro palabras: " + palabras);
    }

    @Override
    public void add(Documento component) {
        documentos.add(component);

    }

    @Override
    public void remove(Documento component) {
        documentos.remove(component);

    }

    @Override
    public void getChild(int position) {
        documentos.get(position);

    }

}
