import java.util.Scanner;

/**
 * Реализация простых действий калькулятора : сложение, вычитание, умножение, деление
 * @author Якушина Наталья
 */

public class Base {
    public static double result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3- умножение, 4 - деление");
        int operation = scanner.nextInt();
        switch (operation) {
            // операция сложение
            case 1:
                result = num1 + num2;
                System.out.printf("Сумма равна: %.4f", result);
                break;
            // операция вычитание
            case 2:
                result = num1 - num2;
                System.out.printf("Разница равна: %.4f", result);
                break;
            // операция умножение
            case 3:
                result = num1 * num2;
                System.out.printf("Произведение равно: %.4f", result);
                break;
            // операция деление
            case 4:
                result = num1 / num2;
                System.out.printf("Частное равно: %.4f", result);
                break;
            default:
                System.err.println("Значение операции введено неверно");
                break;


        }
    }
}
