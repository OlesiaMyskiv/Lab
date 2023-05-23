public class Task2 {
    public static void main(String[] args) {
        double a = 8; // довжина першого катета
        double b = 5; // довжина другого катета

        double hypotenuse = Math.sqrt(a * a + b * b); // обчислення гіпотенузи за теоремою Піфагора
        double area = 0.5 * a * b; // обчислення площі прямокутного трикутника
        double perimeter = a + b + hypotenuse; // обчислення периметра прямокутного трикутника

        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);
    }
}

