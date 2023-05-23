import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        int size = 15;

        int[] array = new int[size];

        // заповнюємо масив випадковими числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(11); // випадкове число від 0 до 10
        }

        System.out.println("Масив:");
        printArray(array);

        // підраховуємо кількість парних елементів
        int evenCount = countEvenElements(array);

        System.out.println("Кількість парних елементів: " + evenCount);
    }

    // метод для виведення масиву на екран
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // метод для підрахунку кількості парних елементів
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}