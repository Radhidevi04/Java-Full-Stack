class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Person Name : " + name);
		System.out.println("Person age : " + age);
	}
}
public class Person1 {
	public static void main(String args[]) {
		Person p1 = new Person("Pugal",6);
		p1.display();
		Person p2 = new Person("Dharshan",3);
		p2.display();
	}

}