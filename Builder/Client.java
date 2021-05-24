package PresentacionEjercicios.Builder;

public class Client {
    public static void main(String []args){
        Consumidor tilin = new Consumidor();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaClasica pizzaClasica = new PizzaClasica();
        PizzaHawaina pizzaHawaina = new PizzaHawaina();

        tilin.setBuilderPizza(PizzaHawaina);
        tilin.cocinarPizza();

        Pizza PizzaHawaina = tilin.getPizza();
        pizzaHawaina.showData();


        tilin.setBuilderPizza(PizzaClasica);
        tilin.cocinarPizza();

        Pizza PizzaClasica = tilin.getPizza();
        pizzaClasica.showData();


        tilin.setBuilderPizza(PizzaCarnivora);
        tilin.cocinarPizza();

        Pizza PizzaCarnivora = tilin.getPizza();
        pizzaCarnivora.showData();
    }
}
