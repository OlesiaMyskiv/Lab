public class Task1 {
    public static void main(String[] args) {
        int arrayList = (99 - 1) / 2 + 1;
        int[] array = new int[arrayList];


        int number = 1; // Заповнення масиву непарними числами
        for (int i = 0; i < arrayList; i++) {
            array[i] = number;
            number += 2;
        }

        for (int i = 0; i < arrayList; i++) { // Виведення елементів масиву стовпчиком
            System.out.println(array[i]);
        }
    }
}
