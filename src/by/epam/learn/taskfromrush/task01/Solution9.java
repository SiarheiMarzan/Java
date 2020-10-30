package by.epam.learn.taskfromrush.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.
Правило треугольника
*/

public class Solution9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Треугольник существует.");
        }
        else if (c >= a + b || a >= b + c || b >= c + a) {
            System.out.println("Треугольник не существует.");
        }

    }
}
