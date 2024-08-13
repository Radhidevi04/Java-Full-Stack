import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomIntInRange = random.nextInt(100);
        System.out.println("Random Integer between 0 and 100 using Random class: " + randomIntInRange);
    }
}
