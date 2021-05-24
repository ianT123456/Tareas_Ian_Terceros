package PresentacionEjercicios.Builder;

public class PizzaCarnivora extends BuilderPizza {


    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("relleno de queso");
    }

    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("criollo");

    }

    @Override
    public void buildingredientes() {
        pizza.setIngredientes("pasankall,harina,tomate,huevo");
    }
    public void showData(){
        system.out.println("tipo queso"+tipoQueso);
        system.out.println("ingrediente"+ingredientes);
        system.out.println("tipo masa"+tipoMasa);
    }
}
