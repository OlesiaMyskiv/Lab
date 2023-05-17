import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        Random random = new Random();

        // Наповнення першого та другого масиву випадковими числами від 0 до 10
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(11);
            array2[i] = random.nextInt(11);
        }

        System.out.println("Перший масив: " + Arrays.toString(array1));
        System.out.println("Другий масив: " + Arrays.toString(array2));

        // Заповнення третього масиву сумою елементів першого та другого масиву з відповідними індексами
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Третій масив: " + Arrays.toString(array3));
    }
}
