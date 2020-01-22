package FourthProblem;

public class Photo {
    private double width;
    private double height;
    private String name;

    public Photo(double height) {
        this.height = height;
    }

    public Photo(double height,double width){
        this.height=height;
        this.width=width;
    }

    public Photo() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
