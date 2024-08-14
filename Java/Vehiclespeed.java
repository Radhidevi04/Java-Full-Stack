class Vehicle1{
	void speedUp() {
		System.out.println("Speed of the Vehicle");
	}
}
class Car1 extends Vehicle1{
	void speedUp() {
		System.out.println("Car spped is 50 Km / hr");
	}
}
class Bicycle extends Vehicle1{
	void speedUp() {
		System.out.println("Bicycle spped is 5 km / hr");
	}
}
public class Vehiclespeed {

	public static void main(String[] args) {
		Car1 c = new Car1();
		c.speedUp();
		Bicycle b = new Bicycle();
		b.speedUp();

	}

}
