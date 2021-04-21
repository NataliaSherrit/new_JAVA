import java.util.Scanner;

/**
 * Задание с выбором:
 * 1. Калькулятор
 * 2. Нахождение самого длинного слова в массиве
 * @author Якушина Наталья
 */

public class Main {
    public static int max = 0;
    public static String word;
    public static double result;
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        // Выбор пользователем вида задания
        System.out.println("Введите номер задания: 1 - калькулятор, 2 - слова ");
        int num = task.nextInt();
        //Проверка на корректность ввода номера задания
        if (num != 1 && num != 2){
            System.err.println("значение некорректно");
        } else if (num == 1) {
            //Задание - калькулятор
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число");
            double num2 = scanner.nextDouble();
            System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3- умножение, 4 - деление");
            int operation = scanner.nextInt();
            switch (operation) {
                // операция сложение
                case 1 -> {
                    result = num1 + num2;
                    System.out.printf("Сумма равна: %.4f", result);
                }
                // операция вычитания
                case 2 -> {
                    result = num1 - num2;
                    System.out.printf("Разница равна: %.4f", result);
                }
                // операция умножение
                case 3 -> {
                    result = num1 * num2;
                    System.out.printf("Произведение равно: %.4f", result);
                }
                // операция деление
                case 4 -> {
                    result = num1 / num2;
                    System.out.printf("Частное равно: %.4f", result);
                }
                default -> System.err.println("Значение операции введено неверно");
            }
            //Задание - нахождение самого длинного слова в массиве
        }else {
            Scanner number = new Scanner(System.in);
            System.out.println("Введите количество слов");
            int count = number.nextInt();
            // Объявление массива длиной в количество слов
            String[] array = new String[count];
            Scanner t = new Scanner(System.in);
            int i = 0;
            //Заполнение массива введенными пользователем словами
            for (String element : array) {
                System.out.println("Введите " + (i+1) + " слово");
                array[i] = t.nextLine();//вводим слово
                int l = array[i].length();
                //Нахождение слова с максимальной длиной
                if (max < l) {
                    max = l;
                    word = array[i];
                }
                i++;
            }
            System.out.println("Самое длинное слово - " + max + " символов");
            System.out.println("Это слово " + word);
        }
    }
}
