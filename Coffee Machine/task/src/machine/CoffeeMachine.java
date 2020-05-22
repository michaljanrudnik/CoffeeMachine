package machine;
import java.util.Scanner;
public class CoffeeMachine {
    int waterSupply = 400;
    int milkSupply = 540;
    int coffeeBeansSupply = 120;
    int disposableCups = 9;
    int amountOfMoney = 550;

    public void printMachineState() {
        System.out.println("\n");
        System.out.println("The coffee machine has:");
        System.out.println(waterSupply + " of water");
        System.out.println(milkSupply + " of milk");
        System.out.println(coffeeBeansSupply + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + amountOfMoney + " of money \n");

    }

    public void buyACoffee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String option = scanner.next();
        switch (option) {
            case "1":
                checkResources(250,0, 16, 1, 4);
                break;
            case "2":
                checkResources(350, 75, 20, 1, 7);
                break;
            case "3":
                checkResources(200, 100, 12, 1, 6);
                break;
            case "back":
                break;
        }


    }

    public void checkResources(int water, int milk, int coffee, int cups, int money) {
        boolean enoughResources = true;
        if (water > waterSupply) {
            enoughResources = false;
            System.out.println("Sorry, not enough water! \n");
        }
        else if (milk > milkSupply) {
            enoughResources = false;
            System.out.println("Sorry, not enough milk! \n");
        }
        else if (coffee > coffeeBeansSupply) {
            enoughResources = false;
            System.out.println("Sorry, not enough coffee beans! \n");
        }
        else if (cups > disposableCups) {
            enoughResources = false;
            System.out.println("Sorry, not enough cups! \n");
        }

        if (enoughResources) {
            waterSupply -= water;
            milkSupply -= milk;
            coffeeBeansSupply -= coffee;
            disposableCups -= cups;
            amountOfMoney += money;
            System.out.println("I have enough resources, making you a coffee! \n");
        }
    }

    public void fillAMachine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        waterSupply += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkSupply += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeansSupply += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        disposableCups += scanner.nextInt();
        System.out.println("\n");

    }

    public void takeFromMachine() {
        System.out.println("I gave you $" + amountOfMoney + "\n");
        amountOfMoney = 0;
    }

    public static void main(String[] args) {
        boolean exit = true;
        CoffeeMachine start = new CoffeeMachine();

        Scanner scanner = new Scanner(System.in);

        while (exit){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choose = scanner.next();
            switch (choose) {
                case "buy":
                    start.buyACoffee();
                    break;
                case "fill":
                    start.fillAMachine();
                    break;
                case "take":
                    start.takeFromMachine();
                    break;
                case "remaining" :
                    start.printMachineState();
                    break;
                case "exit" :
                    exit = false;
                    break;
            }
        }
    }
}
