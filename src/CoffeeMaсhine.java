import java.util.Scanner;

public class CoffeeMaсhine {

    public static final double VOLUME_FOR_BEANS = 0.260;
    public static final double VOLUME_FOR_MILK = 0.600;
    public static final double VOLUME_FOR_WATER = 1.700;

    public static final double MIN_BEANS_FOR_ONE_PORTION = 0.025;
    public static final double MIN_MILK_FOR_ONE_PORTION = 0.080;
    public static final double MIN_WATER_FOR_ONE_PORTION = 0.150;

    private double beans = VOLUME_FOR_BEANS;
    private double milk = VOLUME_FOR_MILK;
    private double water = VOLUME_FOR_WATER;

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

    public double getBeans() {return beans;}
    public double getMilk() {return milk;}
    public double getWater() {return water;}

    public void setBeans(double beans) {this.beans = beans;}
    public void setMilk(double milk) {this.milk = milk;}
    public void setWater(double water) {this.water = water;}

    public void printLoadingOfMakingToCoffee() throws InterruptedException {
        System.out.println("");
        for (int i = 10; i <= 100; i+=10) {
            System.out.print(i + "%");
            Thread.sleep(250);
        }
        System.out.println("");
    }

    public void printLoadingOfChangingToIngredients() throws InterruptedException {
        System.out.println("");
        for (int i = 10; i <= 100; i+=10) {
            System.out.print("-");
            Thread.sleep(500);
        }
        System.out.println("");
    }

    public boolean checkIngredients(){
        if(getBeans() < MIN_BEANS_FOR_ONE_PORTION){
            System.out.println("Not enough beans. Please, wait 1 minute.");
            return (true);
        }else if (getMilk() < MIN_MILK_FOR_ONE_PORTION){
            System.out.println("Not enough milk. Please, wait 1 minute.");
            return (true);
        }else if (getWater() < MIN_WATER_FOR_ONE_PORTION){
            System.out.println("Not enough water. Please, wait 1 minute.");
            return (true);
        }else{
            return (false);
        }
    }

    public void addIngredientsToCoffeeMachine(){
        if (getBeans() < MIN_BEANS_FOR_ONE_PORTION) {
            setBeans(VOLUME_FOR_BEANS);
        }else if (getMilk() < MIN_MILK_FOR_ONE_PORTION) {
            setMilk(VOLUME_FOR_MILK);
        }else if (getWater() < MIN_WATER_FOR_ONE_PORTION) {
            setWater(VOLUME_FOR_WATER);
        }else {
            System.out.println("Ingredients are enough.");
        }
    }

    public void deductIngredientsForCappuccino(){
        beans = beans - Cappuccino.BEANS;
        milk = milk - Cappuccino.MILK;
        water = water - Cappuccino.WATER;
    }
    public void deductIngredientsForLatte(){
        beans = beans - Latte.BEANS;
        milk = milk - Latte.MILK;
        water = water - Latte.WATER;
    }
    public void deductIngredientsForEspresso(){
        beans = beans - Espresso.BEANS;
        milk = milk - Espresso.MILK;
        water = water - Espresso.WATER;
    }
    public void deductIngredientsForMocaccino(){
        beans = beans - Mocaccino.BEANS;
        milk = milk - Mocaccino.MILK;
        water = water - Mocaccino.WATER;
    }

    public void makeCappuccino() throws InterruptedException {
        if (checkIngredients()) {
            addIngredientsToCoffeeMachine();
            printLoadingOfChangingToIngredients();
            System.out.println("Thank you! Try again.");
        }else {
            deductIngredientsForCappuccino();
        System.out.println("\n" + "Cappuccino is making..." + "\n");
        printLoadingOfMakingToCoffee();
        System.out.println("Cappuccino is done!"+ "\n");
            System.out.println(getBeans());
            System.out.println(getMilk());
            System.out.println(getWater());
    }
    }
}
