import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[20];  // Створення масиву розміром 20

        Random random = new Random();  // Створення об'єкту для генерації випадкових чисел

        for (int i = 0; i < array.length; i++) {  // Заповнення масиву випадковими числами від 0 до 9
            array[i] = random.nextInt(10);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));  // Виведення початкового масиву у консоль

        for (int i = 1; i < array.length; i += 2) {  // Заміна елементів з непарними індексами на нуль
            array[i] = 0;
        }

        System.out.println("Оновлений масив: " + Arrays.toString(array));  // Виведення оновленого масиву у консоль
    }
}

