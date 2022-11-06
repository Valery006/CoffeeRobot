public class Cappuccino extends CoffeeMaсhine {

    public static final double BEANS = 0.015;
    public static final double MILK = 0.050;
    public static final double WATER = 0.150;

    public static void deductIngredients(){
       CoffeeMaсhine.beans = CoffeeMaсhine.beans - BEANS;
        CoffeeMaсhine.milk = CoffeeMaсhine.milk - MILK;
        CoffeeMaсhine.water = CoffeeMaсhine.water - WATER;
    }

}