import java.util.Random;
import java.util.Scanner;
public class Task4 {
        public static void main(String[] args) {
            Random random = new Random();
            int minNumber = 1;
            int maxNumber = 3;
            int attempts = 2;

            int[] lotteryNumbers = new int[3];
            for (int i = 0; i < 3; i++) {
                lotteryNumbers[i] = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            }

            System.out.println("Ласкаво просимо до гри лотерея!");
            System.out.println("У вас є " + attempts + " спроби, щоб відгадати послідовність трьох чисел з проміжку [" + minNumber + "; " + maxNumber + "].");

            Scanner scanner = new Scanner(System.in);

            for (int attempt = 1; attempt <= attempts; attempt++) { // Код для кожної спроби
                System.out.println("\nСпроба №" + attempt + ":");

                // \n - це спеціальний символ нового рядка, який додає порожній рядок перед повідомленням

                System.out.print("Введіть перше число: ");
                int guess1 = scanner.nextInt();
                System.out.print("Введіть друге число: ");
                int guess2 = scanner.nextInt();
                System.out.print("Введіть третє число: ");
                int guess3 = scanner.nextInt();

                if (guess1 == lotteryNumbers[0] && guess2 == lotteryNumbers[1] && guess3 == lotteryNumbers[2]) {
                    System.out.println("Вітаємо! Ви вгадали правильну послідовність чисел!");
                    return;
                } else {
                    System.out.println("На жаль, ви не вгадали правильну послідовність чисел.");
                    if (attempt < attempts) {
                        System.out.println("Спробуйте ще раз.");
                    }
                }
            }

            System.out.println("\nГра завершилась. Ви не вгадали правильну послідовність чисел.");
            System.out.println("Правильна послідовність чисел: " + lotteryNumbers[0] + ", " + lotteryNumbers[1] + ", " + lotteryNumbers[2]);
        }
    }
