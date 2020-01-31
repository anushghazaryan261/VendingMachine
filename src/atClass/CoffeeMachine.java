package atClass;

public class CoffeeMachine {

    private String brand;
    private double size;
    private String color;

    public CoffeeMachine(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public Drink makeDrink(Command command){
        if(command.getTypeOfDrinks().equals(TypeOfDrinks.TEA)){
            return new Tea(command.getQuantityOfSugar());
        }
        else{
            return new Coffe(command.getQuantityOfSugar());
        }
    }
}
