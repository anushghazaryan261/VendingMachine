package atClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine=new CoffeeMachine("Phillips");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a command");
        String input=sc.nextLine();

        Command command = Converter.convertInputToCommand(input);
        System.out.println(command.getTypeOfDrinks() + " with " +
                command.getQuantityOfSugar() + " sugar");

        Drink drink = coffeeMachine.makeDrink(command);

        System.out.println(drink.getClass());

    }
}
