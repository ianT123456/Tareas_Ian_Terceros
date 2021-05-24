package PresentacionEjercicios.Builder;

public class PizzaHawaina extends BuilderPizza {


    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("masa de choclo");
    }
    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("Cheddar");
    }
    @Override
    public void buildingredientes() {
        pizza.setIngredientes("pina,salsa de tomate,otros");
    }
    public void showData(){
        system.out.println("tipo queso"+tipoQueso);
        system.out.println("ingrediente"+ingredientes);
        system.out.println("tipo masa"+tipoMasa);
    }
}
