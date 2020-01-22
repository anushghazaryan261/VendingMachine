package ThirdProblem;

public class Leaf {
    private String color;
    private double size;


    public Leaf(String color,double size) {
        this.color = color;
        this.size=size;
    }

    public Leaf(String color) {
        this.color = color;
    }

    public Leaf() {
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
}
