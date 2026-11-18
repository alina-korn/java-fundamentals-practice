/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 03-for-loops
 * Задача: Вывод чисел от 1 до 10
 *
 * Вывести числа от 1 до 10.
 *
 * for i in range(1,11):
 *     print(i)
 *
 * TODO: Написать решение самостоятельно.
 */
public class Task01_Numbers1To10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= 10; i++){
            System.out.print(i);
            if (i < 10) System.out.print(", ");
        }
        System.out.println();


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
