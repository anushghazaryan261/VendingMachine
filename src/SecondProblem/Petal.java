package SecondProblem;

public class Petal {
    private String color;
    private double size;

    public Petal(String color,double size) {
        this.color = color;
        this.size=size;
    }

    public Petal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
