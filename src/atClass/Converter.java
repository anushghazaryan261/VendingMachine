package atClass;

public class Converter {
    public static Command convertInputToCommand(String input){


        String[] split = input.split(":");

        Command command =new Command();
        if(split[0].equals("T")){
            command.setTypeOfDrinks(TypeOfDrinks.TEA);
        }
        if(split[0].equals("C")){
            command.setTypeOfDrinks(TypeOfDrinks.COFFEE);
        }
        command.setQuantityOfSugar(Integer.valueOf(split[1]));
        return command;
    }
}
