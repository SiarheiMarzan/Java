package by.epam.learn.taskfromrush.task01;
//Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел,
// записанных в аргументах метода.
//Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то
// вывести на экран любое из них

public class Solution3 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int c = abs(a - 10);
        int d = abs(b - 10);

        if (c > d) {
            System.out.println(b);
        } else if (c < d) {
            System.out.println(a);
        } else if (c == d) {
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
