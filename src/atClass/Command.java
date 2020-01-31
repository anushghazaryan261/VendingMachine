package atClass;

public class Command {
    private TypeOfDrinks typeOfDrinks;
    private int quantityOfSugar;

    public int getQuantityOfSugar() {
        return quantityOfSugar;
    }

    public void setQuantityOfSugar(int quantityOfSugar) {
       this.quantityOfSugar=quantityOfSugar;
    }

    public TypeOfDrinks getTypeOfDrinks() {
        return typeOfDrinks;
    }

    public void setTypeOfDrinks(TypeOfDrinks typeOfDrinks) {
        this.typeOfDrinks=typeOfDrinks;

    }
}
