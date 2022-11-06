public class Latte {

    public static final double BEANS = 0.015;
    public static final double MILK = 0.080;
    public static final double WATER = 0.100;

    public static void deductIngredients(){
        CoffeeMaсhine.beans = CoffeeMaсhine.beans - BEANS;
        CoffeeMaсhine.milk = CoffeeMaсhine.milk - MILK;
        CoffeeMaсhine.water = CoffeeMaсhine.water - WATER;
    }

}
