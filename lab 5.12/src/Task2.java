import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int size = 20; // розмір масиву
        int[] array = new int[size]; // створюємо масив

        // заповнюємо масив випадковими числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10); // повертає наступне випадкове значення
        }

        // виведимо початковий масив у консоль
        System.out.println("Початковий масив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // заміна елементів з непарним індексом на нуль
        for (int i = 1; i < size; i += 2) {
            array[i] = 0;
        }

        // виводимо оновлений масиву у консоль
        System.out.println("Оновлений масив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
