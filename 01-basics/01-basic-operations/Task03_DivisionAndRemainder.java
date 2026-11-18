import java.util.Scanner;
/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 01-basic-operations
 * Задача: Операции с остатком от деления
 *
 * Прочитать два числа, вывести частное и остаток от деления.
 *
 * TODO: Написать решение самостоятельно.
 *
 * Python:
 * a = int(input("Введите первое число: "))
 * b = int(input("Введите второе число: "))
 *
 * if a == o:
 *     print("На ноль делить нельзя!")
 * else:
 *     quotient = a // b
 *     remainder = a % b
 *     print("Частное: " + quotient)
 *     print("Остаток: "+ remainder)
 */
public class Task03_DivisionAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {

            int quotient = a / b;
            int remainder = a % b;

            System.out.println("Частное: " + quotient);
            System.out.println("Остаток: " + remainder);
        }
        sc.close();

    }
}



