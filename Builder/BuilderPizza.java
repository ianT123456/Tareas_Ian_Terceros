package PresentacionEjercicios.Builder;

public abstract class BuilderPizza {
    protected Pizza pizza;
    public Pizza getPizza(){
        return pizza;
    }
    public void createPizza(){
        pizza = new Pizza();
    }
    public abstract void buildtipoMasa();
    public abstract void buildtipoQueso();
    public abstract void buildingredientes();
}
