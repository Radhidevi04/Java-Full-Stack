class Animal{
	void move() {
		System.out.println("Animal move from one palce to another place");
	}
	void eat() {
		System.out.println("Animal will eat the food");
	}
}
class Dog extends Animal {
	void move() {
		System.out.println("Dog is walking");
	}
	void eat() {
		System.out.println("Dog eat biscuits");
	}
}
class Bird extends Animal{
	void move() {
		System.out.println("Bird will Fly");
	}
	void eat(){
		System.out.println("Bird eat Grains");
	}
}
class Fish extends Animal{
	void move() {
		System.out.println("Fish will Swim");
	}
	void eat() {
		System.out.println("Fish eat small food");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
		dog.eat();
		Bird bird = new Bird();
		bird.move();
		bird.eat();
		Fish fish= new Fish();
		fish.move();
		fish.eat();
		

	}

}
