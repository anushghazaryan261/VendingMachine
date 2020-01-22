package FifthProblem;

public class Animal {
    private int numberOfLegs;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void makeSounds(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (numberOfLegs != animal.numberOfLegs) return false;
        return color != null ? color.equals(animal.color) : animal.color == null;

    }

    @Override
    public int hashCode() {
        int result = numberOfLegs;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLegs=" + numberOfLegs +
                ", color='" + color + '\'' +
                '}';
    }
}

