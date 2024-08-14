//Dynamic Method Dispatch
//Commom reference handle multiple objects
class Animal1{
	void move() {
		System.out.println("Animal move from one palce to another place");
	}
	void eat() {
		System.out.println("Animal will eat the food");
	}
}
class Dog1 extends Animal1 {
	void move() {
		System.out.println("Dog is walking");
	}
	void eat() {
		System.out.println("Dog eat biscuits");
	}
}
class Bird1 extends Animal1{
	void move() {
		System.out.println("Bird will Fly");
	}
	void eat(){
		System.out.println("Bird eat Grains");
	}
}
class Fish1 extends Animal1{
	void move() {
		System.out.println("Fish will Swim");
	}
	void eat() {
		System.out.println("Fish eat small food");
	}
}
public class DMD {

	public static void main(String[] args) {
		Animal1 animal; 
		animal = new Dog1();
		animal.move();
		animal.eat();
		animal = new Bird1();
		animal.move();
		animal.eat();
		animal = new Fish1();
		animal.move();
		animal.eat();
		
		

	}

}
