import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше слово:");
        String word1 = scanner.next();

        System.out.println("Введіть друге слово:");
        String word2 = scanner.next();

        System.out.println("Введіть третє слово:");
        String word3 = scanner.next();

        System.out.println("Введіть четверте слово:");
        String word4 = scanner.next();

        System.out.println("Введіть п'яте слово:");
        String word5 = scanner.next();

        String sentence = word1.concat("").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        //за допомогою concat з'єднуємо рядки

        System.out.println("Ваше речення: " + sentence);
    }
}
