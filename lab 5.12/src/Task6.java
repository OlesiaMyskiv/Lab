import java.util.Arrays;
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[15][];

        // Визначення кількості стовбців для кожного рядка
        int[] columns = {5, 5, 5, 5, 8, 8, 8, 8, 3, 3, 3, 3, 9, 9, 9};

        Random random = new Random();

        // Створення та заповнення двовимірного масиву
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[columns[i]];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }

        // Виведення двовимірного масиву у консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}


