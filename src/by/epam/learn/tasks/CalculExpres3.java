package by.epam.learn.tasks;

import java.util.Scanner;

public class CalculExpres3 {
    public static void main(String[] args) {
        System.out.println("Intput value variables a, b, c: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

//        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
//            System.out.println("false");
//        } else {
        double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                + Math.pow(b, -2));
        System.out.println("Expression result: " + sum);
        //}

    }

    static double square(double x) {
        System.out.println("Возводим в квадрат");
        return x * x;
    }

}

