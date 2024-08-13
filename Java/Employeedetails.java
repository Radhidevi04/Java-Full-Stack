class Person2{
	void getFirstName() {
		System.out.println("Radhidevi");
	}
	void getLastName() {
		System.out.println("K");
	}
}
class Employeede extends Person2{
	void getEmployeeId() {
		System.out.println("EMP101");
	}
	void getLastName() {
		System.out.println("Tester");
	}
}
public class Employeedetails {

	public static void main(String[] args) {
		Employeede e = new Employeede();
		e.getFirstName();
		e.getLastName();
		e.getEmployeeId();

	}

}