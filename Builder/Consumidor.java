package PresentacionEjercicios.Builder;

public class Consumidor {
    private BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza){
        this.builderPizza=builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }
    public void cocinarPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildingredientes();
        this.builderPizza.buildtipoQueso();
        this.builderPizza.buildtipoMasa();
    }

}
