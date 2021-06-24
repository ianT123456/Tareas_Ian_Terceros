package Composite;

abstract class Componente {
    private String nombre;
    private int precio;

    public Componente(String nombre){
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract  int compraTotal();
    public abstract  void add(Componente component);
    public abstract  void remove(Componente component);
    public abstract  void getChild(int position);

}
