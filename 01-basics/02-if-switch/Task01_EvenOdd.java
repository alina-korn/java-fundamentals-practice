import java.util.Scanner;

/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 02-if-switch
 * Задача: Проверка чётности числа
 *
 * Определить, является ли число чётным или нечётным.
 *
 * chek_number = int(input("Введите число: "))
 *
 * if chek_number % 2 == 0:
 *     print(f'Число {chek_number} четное')
 * else:
 *     print(f'Число {chek_number} нечетное')
 *
 *

 * TODO: Написать решение самостоятельно.
 */
public class Task01_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chek_number = sc.nextInt();

        if (chek_number % 2 == 0) {
            System.out.println("Число " + chek_number + " четное.");
        }
        else {
            System.out.println("Число " + chek_number + " нечетное.");
        }
    }
}
