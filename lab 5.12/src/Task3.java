import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];  // Створення першого масиву розміром 5
        int[] array2 = new int[5];  // Створення другого масиву розміром 5
        int[] array3 = new int[5];  // Створення третього масиву розміром 5
        Random random = new Random();  // Створення об'єкту для генерації випадкових чисел

        // Заповнення масивів випадковими числами від 0 до 5
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
            array3[i] = random.nextInt(6);
        }

        System.out.println("Перший масив: " + Arrays.toString(array1));  // Виведення першого масиву у консоль
        System.out.println("Другий масив: " + Arrays.toString(array2));  // Виведення другого масиву у консоль
        System.out.println("Третій масив: " + Arrays.toString(array3));  // Виведення третього масиву у консоль

        double average1 = calculateAverage(array1);  // Обчислення середнього значення першого масиву
        double average2 = calculateAverage(array2);  // Обчислення середнього значення другого масиву
        double average3 = calculateAverage(array3);  // Обчислення середнього значення третього масиву

        // Порівняння середніх значень масивів та виведення відповідного повідомлення
        if (average1 > average2 && average1 > average3) {
            System.out.println("Середнє значення першого масиву більше за інші.");
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("Середнє значення другого масиву більше за інші.");
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("Середнє значення третього масиву більше за інші.");
        } else {
            System.out.println("Середні значення масивів рівні.");
        }
    }

    // Метод для обчислення середнього арифметичного значення масиву
    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i]; // Підрахунок суми елементів масиву
        }
        return (double) sum / array.length; // Обчислення середнього арифметичного значення та його повернення
    }
}
