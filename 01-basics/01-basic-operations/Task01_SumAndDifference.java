import java.util.Scanner;

/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 01-basic-operations
 * Задача: Сложение и вычитание чисел
 *
 * Прочитать два числа с консоли, вывести сумму и разность.
 *
 * TODO: Написать решение самостоятельно.
 */
public class Task01_SumAndDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();

        int toAdd = calculateAdd(firstNumber, secondNumber);
        int toDeduct = calculateDeduct(firstNumber, secondNumber);

        System.out.println("Сумма: " + toAdd);
        System.out.println("Разность: " + toDeduct);
    }
    public static int calculateAdd(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int calculateDeduct(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
