package FirstProblem;

public class Door {
    private double width;
    private double height;
    private String material;

    public Door(double height) {
        this.height = height;
    }

    public Door(double height,double width){
        this.height=height;
        this.width=width;
    }

    public Door(String material) {
        this.material = material;
    }

    public Door() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
