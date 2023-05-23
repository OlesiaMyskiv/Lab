import java.util.Random;
public class Task4 {
   public static void main(String[] args) {
        int size = 10;

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];

        // заповнюємо перші два масиви випадковими числами від 0 до 10
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(11);
            array2[i] = random.nextInt(11);
        }

        // заповнюємо третій масив сумою елементів перших двох масивів
        for (int i = 0; i < size; i++) {
            array3[i] = array1[i] + array2[i];
        }


        System.out.println("Перший масив:");
        printArray(array1);
        System.out.println("Другий масив:");
        printArray(array2);
        System.out.println("Третій масив (сума елементів перших двох масивів):");
        printArray(array3);
    }

    // метод для виведення масиву у консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}