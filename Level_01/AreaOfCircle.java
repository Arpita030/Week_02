class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double areaofcircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    double Circumferenceofcircle() {
        return 2 * Math.PI * radius;
    }

    void displayDetails(double areaofcircle, double Circumferenceofcircle) {
        System.out.println("Area of circle is  " +areaofcircle)
        System.out.println("Circumference of circle is  " +Circumferenceofcircle)
     }

}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        c.displayDetails(c.areaofcircle(), c.Circumferenceofcircle());
    }
}