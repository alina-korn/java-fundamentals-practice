import java.util.Scanner;

/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 01-basic-operations
 * Задача: Перевод градусов Цельсия в Фаренгейты
 *
 * Преобразовать температуру в градусы Фаренгейта.
 *
 * TODO: Написать решение самостоятельно.
 * °F = (°C × 1.8) + 32
 * °C = (°F − 32) / 1.8
 * c = float(input("Введите температуру в Цельсиях: ")
 * f = (c * 1.8) + 32
 * print("Температура в Фаренгейтах: " + f)
 *
 * f_raw = float(input("Введите температуру в Фаренгейтах: ")
 * f_in_c = (f_raw = 32) / 1.8
 * print("Температура в Цельсиях: " + f_in_c)
 *
 */
public class Task04_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Celsius : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit2 = sc.nextDouble();
        double tempcelsius = (fahrenheit2 - 32) * 5 / 9;
        System.out.println("Fahrenheit : " + tempcelsius);
        sc.close();

    }
}
