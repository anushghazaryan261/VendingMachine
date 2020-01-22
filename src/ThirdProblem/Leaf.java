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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        if (Double.compare(leaf.size, size) != 0) return false;
        return color != null ? color.equals(leaf.color) : leaf.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
