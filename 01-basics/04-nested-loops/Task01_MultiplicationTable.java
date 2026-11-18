/**
 * ДЗ №2 — Основы основ в Java
 * Раздел: 04-nested-loops
 * Задача: Таблица умножения
 *
 * Вывести таблицу умножения от 1 до 10.
 *
 * for i in range(1, 11):
 *     for j in range(1, 11):
 *         print(f"{i} x {j} = {i * j}")
 *     print()
 * TODO: Написать решение самостоятельно.
 */
public class Task01_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();}
        }
}
