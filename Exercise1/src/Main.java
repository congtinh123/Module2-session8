
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "Red");
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println(circle);

        // Test Cylinder
        Cylinder cylinder = new Cylinder(2.0, "Blue", 5.0);
        System.out.println("\nCylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder color: " + cylinder.getColor());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println(cylinder);
    }
}