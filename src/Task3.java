import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = 1 + random.nextInt(100);
        System.out.println("The random number is: " + randomNumber);

        if(randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number.");
        } else {
            System.out.println(randomNumber + " is an odd number.");
        }
    }
}
