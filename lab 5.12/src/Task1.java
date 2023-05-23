public class Task1 {
   public static void main(String[] args) {
       int size = 50; // розмір масиву
       int[] masyv = new int[size]; // створюємо масив
       
       int number = 1; // заповнюємо масив непарними числами
       for (int i = 0; i < size; i++) {
           masyv[i] = number;
           number += 2;
       }

  
       for (int i = 0; i < size; i++) { // виведимо елементи масиву стовпчиком
           System.out.println(masyv[i]);
       }
   }
}
