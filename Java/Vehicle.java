class car{
	void drive() {
		System.out.println("Running ");
	}
}
class repair extends car {
	void drive() {
		System.out.println("repaired");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		System.out.println("Car is ");
        repair c = new repair();
        c.drive();
	}

}

