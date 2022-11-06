import java.util.Scanner;

public class CoffeeMaсhine {

    public static final double VOLUME_FOR_BEANS = 0.260;
    public static final double VOLUME_FOR_MILK = 0.600;
    public static final double VOLUME_FOR_WATER = 1.700;

    public static double beans = VOLUME_FOR_BEANS;
    public static double milk = VOLUME_FOR_MILK;
    public static double water = VOLUME_FOR_WATER;

    public static final double MIN_BEANS_FOR_ONE_PORTION = 0.025;
    public static final double MIN_MILK_FOR_ONE_PORTION = 0.080;
    public static final double MIN_WATER_FOR_ONE_PORTION = 0.150;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        CoffeeMaсhine coffeeMaсhine = new CoffeeMaсhine();

        while (true) {
            String clientPick = scanner.nextLine();
            if (clientPick.equals("1")) {
                coffeeMaсhine.makeCappuccino();
            }
            else {
                System.out.println("Your pick is not correct.");
            }
        }
    }

    public void printLoading() throws InterruptedException {
        System.out.println("\n" + "Cappuccino is making..." + "\n");
        for (int i = 10; i <= 100; i+=10) {
            System.out.print(i + "%");
            Thread.sleep(250);
        }
        System.out.println("\n" + "Cappuccino is done!" + "\n");
    }

    public void printLoading2() throws InterruptedException {
        for (int i = 10; i <= 100; i+=10) {
            System.out.print("-");
            Thread.sleep(500);
        }
        System.out.println("\n" + "Thank you! Try again.");
    }

    public void printNeedIngredient(double ingredient){
        System.out.println("\n" + "Not enough " + ingredient + ". Please, wait 1 minute.");
    }

    public boolean checkIngredients(){
        if(beans < MIN_BEANS_FOR_ONE_PORTION){
           printNeedIngredient(beans);
            return (true);
        }else if (milk < MIN_MILK_FOR_ONE_PORTION){
            printNeedIngredient(milk);
            return (true);
        }else if (water < MIN_WATER_FOR_ONE_PORTION){
            printNeedIngredient(water);
            return (true);
        }else{
            return (false);
        }
    }

    public void addIngredientsToCoffeeMachine(){
        if (beans < MIN_BEANS_FOR_ONE_PORTION) {
            beans = VOLUME_FOR_BEANS;
        }else if (milk < MIN_MILK_FOR_ONE_PORTION) {
            milk = VOLUME_FOR_MILK;
        }else if (water < MIN_WATER_FOR_ONE_PORTION) {
            water = VOLUME_FOR_WATER;
        }else {
            System.out.println("Ingredients are enough.");
        }
    }

    public void makeCappuccino() throws InterruptedException {
        if (checkIngredients()) {
            addIngredientsToCoffeeMachine();
            printLoading2();
        }else {
            Cappuccino.deductIngredients();
            printLoading();
            System.out.println(beans);
            System.out.println(milk);
            System.out.println(water);
    }
    }
}
