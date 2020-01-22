package SecondProblem;
import java.util.ArrayList;

public class Rose {
    private ArrayList<Petal> petals;
    private Bud bud;
    private double height;

    public Rose(Bud bud) {
        this.bud = bud;
    }

    public Rose(double height) {
        this.height = height;
    }

    public Rose() {
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ArrayList<Petal> getPetals() {
        return petals;
    }

    public void setPetals(ArrayList<Petal> petals) {
        this.petals = petals;
    }

    public void bloom(){
        if(!bud.isOpen()){
            bud.setOpen(true);
        }
    }
    public void wilt(){
        petals.clear();
    }

    public void printQuantityOfPetals(){
        System.out.println("The quantity of petals is: " + petals.size());
    }
}
