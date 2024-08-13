class Animal{
	void sound(){
		System.out.println("Meow....");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Barking");
	}
}
public class Animalsound {

	public static void main(String[] args) {
		System.out.println("Cat Sound : ");
		Cat s = new Cat();
		s.sound();
		

	}

}