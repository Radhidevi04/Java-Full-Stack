class Shape1{
	void calculateArea() {
		System.out.println("Area");
	}
}
class Circle2 extends Shape1{
	void calculateArea() {
		int r = 10;
		float pi = 3.14f;
		float c = pi * (r^2);
		System.out.println("Area of Circle : " + c);
	}
}
class Rectangle2 extends Shape1{
	void calculateArea() {
		int l = 5;
		int b = 10;
		int a = l * b;
		System.out.println("Area of Rectangle : " + a);
	}
}
class Triangle2 extends Shape1{
	void calculateArea() {
		int b = 8;
		int h = 20;
		int a = (b*h)/2;
		System.out.println("ARea of Triangle : " + a );
	}
}
public class Area {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.calculateArea();
		Rectangle2 r = new Rectangle2();
		r.calculateArea();
		Triangle2 t = new Triangle2();
		t.calculateArea();

	}

}
