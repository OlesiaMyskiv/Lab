import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int size = 5; // масиву
        int[] array1 = new int[size]; // перший масив
        int[] array2 = new int[size]; // другий масив
        int[] array3 = new int[size]; // третій масив

        // заповнюємо масиви випадковими числами
        Random random = new Random();
        for (int i = 0; i < size; i++) { // випадкові числа від 0 до 5
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
            array3[i] = random.nextInt(6);
        }

        // виведемо масиви у консоль
        System.out.println("Масив 1:");
        printArray(array1);
        System.out.println("Масив 2:");
        printArray(array2);
        System.out.println("Масив 3:");
        printArray(array3);

        // обчислюємо середнє арифметичне кожного масиву
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        double average3 = calculateAverage(array3);

        // порівнюємо середні значеня масивів і виведимо повідомлення
        if (average1 > average2 && average1 > average3) {
            System.out.println("Середнє значення масиву 1 є більшим");
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("Середнє значення масиву 2 є більшим");
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("Середнє значення масиву 3 є більшим");
        } else {
            System.out.println("Середні значення масивів рівні");
        }
    }

    // метод для виведення масиву у консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // метод для обчислення середнього арифметичного масиву
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}