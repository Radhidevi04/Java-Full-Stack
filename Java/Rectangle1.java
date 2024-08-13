
class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double calculateArea() {
        return width * height;
    }
    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    
    public void displayDetails() {
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Height: " + height);
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.displayDetails();
    }
}