class Circle {
    private double radius;  
    public Circle(double radius) {
        this.radius = radius;
    }
        public double getRadius() {
        return radius;
    } 
    public void setRadius(double radius) {
        this.radius = radius;
    }  
    public double calculateArea() {
        return Math.PI * radius * radius;
    }  
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }
}
public class Circle1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayDetails();
        circle.setRadius(7.0);
        System.out.println("After modifying the radius:");
        circle.displayDetails();
    }
}