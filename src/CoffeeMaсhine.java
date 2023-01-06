import java.util.Scanner;

public class CoffeeMaсhine {

    public static final double VOLUME_FOR_BEANS = 0.260;
    public static final double VOLUME_FOR_MILK = 0.600;
    public static final double VOLUME_FOR_WATER = 1.700;

    public static double beans = VOLUME_FOR_BEANS;
    public static double milk = VOLUME_FOR_MILK;
    public static double water = VOLUME_FOR_WATER;

    public static String cappuccino = "Cappuccino";
    public static String mocaccino = "Mocaccino";
    public static String latte = "Latte";
    public static String espresso = "Espresso";

    public static void main(String[] args) throws InterruptedException {

        CoffeeMaсhine coffeeMaсhine = new CoffeeMaсhine();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            coffeeMaсhine.printMenu();
            String clientPick = scanner.nextLine();

            if (clientPick.equals("1")) {
              coffeeMaсhine.makeCappuccino();
            } else if (clientPick.equals("2")) {
                coffeeMaсhine.makeMocaccino();
            } else if (clientPick.equals("3")) {
                coffeeMaсhine.makeLatte();
            } else if (clientPick.equals("4")) {
                coffeeMaсhine.makeEspresso();
            } else {
                System.out.println("Enter the correct number.");
            }
        }
    }
    public void printMenu() {
        System.out.println("> 1 < " + cappuccino);
        System.out.println("> 2 < " + mocaccino);
        System.out.println("> 3 < " + latte);
        System.out.println("> 4 < " + espresso);
    }
    public void printLoading(String coffee) throws InterruptedException {
        System.out.println("\n" + "" + coffee + " is making..." + "\n");
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + "%");
            Thread.sleep(250);
        }
        System.out.println("\n" + "" + coffee + " is done!" + "\n");
    }

    public void printLoading2() throws InterruptedException {
        for (int i = 10; i <= 100; i += 10) {
            System.out.print("-");
            Thread.sleep(500);
        }
        System.out.println("\n" + "Thank you! Try again.");
    }

    public void printNeedIngredients() {
        System.out.println("\n" + "Not enough ingredients, please, wait 1 minute.");
    }
    public void printIngredients(){
        System.out.println("Зёрна " + beans + " Молоко " + milk + " Вода " + water + "\n");
    }

    public boolean checkBeansForCappuccino() {
        if (beans < Cappuccino.BEANS) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkMilkForCappuccino() {
        if (milk < Cappuccino.MILK) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkWaterForCappuccino() {
        if (water < Cappuccino.WATER) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBeansForMocaccino() {
        if (beans < Mocaccino.BEANS) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkMilkForMocaccino() {
        if (milk < Mocaccino.MILK) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkWaterForMocaccino() {
        if (water < Mocaccino.WATER) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBeansForLatte() {
        if (beans < Latte.BEANS) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkMilkForLatte() {
        if (milk < Latte.MILK) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkWaterForLatte() {
        if (water < Latte.WATER) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBeansForEspresso() {
        if (beans < Espresso.BEANS) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkMilkForEspresso() {
        if (milk < Espresso.MILK) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkWaterForEspresso() {
        if (water < Espresso.WATER) {
            return true;
        } else {
            return false;
        }
    }

    public void subtractCappuccino(){
         beans -= Cappuccino.BEANS;
         milk -= Cappuccino.MILK;
         water -= Cappuccino.WATER;
    }
    public void subtractMocaccino(){
        beans -= Mocaccino.BEANS;
        milk -= Mocaccino.MILK;
        water -= Mocaccino.WATER;
    }
    public void subtractLatte(){
        beans -= Latte.BEANS;
        milk -= Latte.MILK;
        water -= Latte.WATER;
    }
    public void subtractEspresso(){
        beans -= Espresso.BEANS;
        milk -= Espresso.MILK;
        water -= Espresso.WATER;
    }

    public void addBeans() {
        beans = VOLUME_FOR_BEANS;
        System.out.println("Beans is enough.");
    }

    public void addMilk() {
        milk = VOLUME_FOR_MILK;
        System.out.println("Milk is enough.");
    }

    public void addWater() {
        water = VOLUME_FOR_WATER;
        System.out.println("Water is enough.");
    }

    public void makeCappuccino() throws InterruptedException {
        if (checkBeansForCappuccino()){
            printNeedIngredients();
            printLoading2();
            addBeans();
        } else if(checkMilkForCappuccino()){
            printNeedIngredients();
            printLoading2();
            addMilk();
        } else if(checkWaterForCappuccino()){
            printNeedIngredients();
            printLoading2();
            addWater();
        } else {
            printLoading(cappuccino);
            subtractCappuccino();
            printIngredients();
        }
    }
    public void makeMocaccino() throws InterruptedException {
        if (checkBeansForMocaccino()){
            printNeedIngredients();
            printLoading2();
            addBeans();
        } else if(checkMilkForMocaccino()){
            printNeedIngredients();
            printLoading2();
            addMilk();
        } else if(checkWaterForMocaccino()){
            printNeedIngredients();
            printLoading2();
            addWater();
        } else {
            printLoading(mocaccino);
            subtractMocaccino();
            printIngredients();
        }
    }
    public void makeLatte() throws InterruptedException {
        if (checkBeansForLatte()){
            printNeedIngredients();
            printLoading2();
            addBeans();
        } else if(checkMilkForLatte()){
            printNeedIngredients();
            printLoading2();
            addMilk();
        } else if(checkWaterForLatte()){
            printNeedIngredients();
            printLoading2();
            addWater();
        } else {
            printLoading(latte);
            subtractLatte();
            printIngredients();
        }
    }
    public void makeEspresso() throws InterruptedException {
        if (checkBeansForEspresso()){
            printNeedIngredients();
            printLoading2();
            addBeans();
        } else if(checkMilkForEspresso()){
            printNeedIngredients();
            printLoading2();
            addMilk();
        } else if(checkWaterForEspresso()){
            printNeedIngredients();
            printLoading2();
            addWater();
        } else {
            printLoading(espresso);
            subtractEspresso();
            printIngredients();
        }
    }
}