import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeric = random.nextInt(101);  // Генеруємо випадкове число від 0 до 100

        int number = String.valueOf(numeric).length();  // Визначаємо кількість цифр у числі
        //valueOf() повертає рядкове уявлення об'єкта аргементу
        // lenght() повертає довжину рядка

        System.out.println("Згенероване число: " + numeric);
        System.out.println("Кількість цифр: " + number);
    }
}