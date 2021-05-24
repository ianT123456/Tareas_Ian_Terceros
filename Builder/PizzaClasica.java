package PresentacionEjercicios.Builder;

public class PizzaClasica extends BuilderPizza {


    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("masa doble");
    }
    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("mozzarella");
    }
    @Override
    public void buildingredientes() {
        pizza.setIngredientes("salsa tomate , queso, jamon");
    }
    public void showData(){
        system.out.println("tipo queso"+tipoQueso);
        system.out.println("ingrediente"+ingredientes);
        system.out.println("tipo masa"+tipoMasa);
    }
}
