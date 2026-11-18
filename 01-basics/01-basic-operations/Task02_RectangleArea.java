import java.util.Scanner;
/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 01-basic-operations
 * Задача: Площадь прямоугольника
 *
 * Прочитать ширину и длину с консоли, вычислить площадь.
 *
 * TODO: Написать решение самостоятельно.
 */
public class Task02_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину: ");
        int length = sc.nextInt();

        System.out.print("Введите ширину: ");
        int width = sc.nextInt();

        int square = calculateArea(width, length);

        System.out.println("Площадь: " + square);
        // TODO: Реализация задачи.
    }
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}



