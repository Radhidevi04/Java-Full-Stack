class Aa {
	Aa(){
		System.out.println("Welcome");
	}
	Aa(int a){
		System.out.println("Welcome all");
	}
}
class Bb extends Aa{
	Bb(){
		super(5);
			System.out.println("Good");
		}
	}

public class SuperKeyword {

	public static void main(String[] args) {
		Bb b = new Bb();

	}

}