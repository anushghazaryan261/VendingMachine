package FirstProblem;

public class Window {
    private double width;
    private double height;

    public Window(double height) {
        this.height = height;
    }

    public Window(double height,double width){
        this.height=height;
        this.width=width;
    }

    public Window() {
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
