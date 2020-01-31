public class Circle {
    private double radius;

    public Circle(double radius) throws IllegalRadiusExeption {
        if(radius<0){
            throw new IllegalRadiusExeption("the radius is negative");
        }else{
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
            this.radius = radius;
    }

    public double getTheArea()  {
        return 3.14*radius*radius;
    }
}
