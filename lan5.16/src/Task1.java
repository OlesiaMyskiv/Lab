import java.util.Random;
public class Task1{
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(41) - 20;
        // random.nextInt повертає випадкове значення

        System.out.println("Випадкове натуральне число: " + number);
    }
}