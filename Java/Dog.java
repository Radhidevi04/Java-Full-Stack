class Dog1{
	String dogname;
	String breedname;
	
	Dog1(String dogname,String breedname){
		this.dogname = dogname;
		this.breedname = breedname;
	}
	void display() {
		System.out.println("Dog name is  " + dogname + " and Dog breed is " + breedname);
	}
	public String getName(){
		return dogname;
	}
	public void setName(String dogname) {
		this.dogname = dogname;
	}
	public String getBreed(){
		return breedname;
	}
	public void setBreed(String breedname) {
		this.breedname = breedname;
	}
	void display2() {
        setBreed("Labrador");
        System.out.println("Dog name is " + dogname + " and Dog breed is " + breedname);

	}
	
}
public class Dog {
    public static void main(String args[]) {
    	Dog1 d1 = new Dog1("Charlie","Bulk dog");
    	d1.display();
		System.out.println("After updated");
		d1.display2();

    }
}