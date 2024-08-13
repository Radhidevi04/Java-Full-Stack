class employee1{
	void work() {
		System.out.println("Work is Tester");
	}
	void getSalary() {
		System.out.println("five thousand");
	}
}
class HRManager1 extends employee1{
	void work() {
		System.out.println("Work is Coding");
	}
	void addEmployee() {
		System.out.println("Ram is new to work");
	}
}
public class Assemployee {
	public static void main(String args[]) {
		HRManager1 obj = new HRManager1();
		obj.work();
		obj.getSalary();
		obj.addEmployee();
	}

}