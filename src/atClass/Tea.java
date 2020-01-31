package atClass;

import java.util.Date;

public class Tea extends Drink {
    private int quantityOfSugar;

    public Tea(int quantityOfSugar) {
        this.quantityOfSugar = quantityOfSugar;
    }

    public int getQuantityOfSugar() {
        return quantityOfSugar;
    }

    public void setQuantityOfSugar(int quantityOfSugar) {
        this.quantityOfSugar = quantityOfSugar;
    }
}
