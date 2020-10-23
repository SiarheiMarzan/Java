package by.epam.learn.tasks;

import java.util.Scanner;

public class CalculExpres1 {
    public static void main(String[] args) {
        System.out.println("Intput value variables a, b, c, d: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if ((c == 0) || (d == 0)) {
            System.out.println("false");
        } else {
           double sum = (((a / c) * (b / d)) - (( a * b -c) / (c*d)));
            System.out.println("Expression result: " + sum);
        }

    }
}

