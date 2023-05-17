import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        // Заповнення масиву випадковими числами від 0 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        System.out.println("Масив: " + Arrays.toString(array));

        int countEven = 0;

        // Підрахунок кількості парних елементів
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Кількість парних елементів: " + countEven);
    }
}
