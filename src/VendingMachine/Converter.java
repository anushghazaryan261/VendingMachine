package VendingMachine;

public class Converter {
    public static Command convertInputToCommand(String input){
        String[] split=input.split(":");
        Command command = new Command();
        command.setRaw(split[0].charAt(0));
        command.setColumn(Integer.valueOf(split[1]));
        return command;
    }

}
