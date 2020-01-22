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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Petal petal = (Petal) o;

        if (Double.compare(petal.size, size) != 0) return false;
        return color != null ? color.equals(petal.color) : petal.color == null;

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
        return "Petal{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
