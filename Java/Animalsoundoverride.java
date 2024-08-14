class Animalfamily{
	void Sound() {
		System.out.println("Animal Sound");
	}
}
class Birdsound extends Animalfamily{
	void Sound() {
		System.out.println("Bird's Sound");
	}
}
class Catsound extends Animalfamily{
	void Sound() {
		System.out.println("Meow");
	}
}
public class Animalsoundoverride {

	public static void main(String[] args) {
        Birdsound b = new Birdsound();
        b.Sound();
        Catsound c = new Catsound();
        c.Sound();

	}

}
