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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rose rose = (Rose) o;

        if (Double.compare(rose.height, height) != 0) return false;
        if (petals != null ? !petals.equals(rose.petals) : rose.petals != null) return false;
        return bud != null ? bud.equals(rose.bud) : rose.bud == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = petals != null ? petals.hashCode() : 0;
        result = 31 * result + (bud != null ? bud.hashCode() : 0);
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "petals=" + petals +
                ", bud=" + bud +
                ", height=" + height +
                '}';
    }
}
