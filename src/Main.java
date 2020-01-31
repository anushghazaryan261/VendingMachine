public class Main {
    public static void main(String[] args) {
        Triangle triangle= null;
        try {
            triangle = new Triangle(4,4,20);
        } catch (IllegalTriangleExeption ex) {
            ex.getMessage();
        }

        System.out.println("the perimeter is: " + triangle.getTheParimeter());

    }
}
