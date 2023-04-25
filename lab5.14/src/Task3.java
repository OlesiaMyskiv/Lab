import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше дробове число:");
        double num1 = 0;
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: Введіть дробове число");
            return;
        }

        System.out.println("Введіть друге дробове число:");
        double num2 = 0;
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: Введіть дробове число");
            return;
        }

        System.out.println("Введіть третє дробове число:");
        double num3 = 0;
        if (scanner.hasNextDouble()) {
            num3 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: Введіть дробове число");
            return;
        }

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Найбільше число: " + max);
    }
}
