package by.epam.learn.tasks;

import java.util.Scanner;

public class CalculExpres3 {

    public static void main(String[] args) {
        System.out.println("Input value variables a, b, c: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

//        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
//            System.out.println("false");
//        } else {
        try {
            double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                    //  + Math.pow(b, -2));
                    + 1 / (b * b));
            System.out.println("Expression result: " + sum);
            String x = "Expression result: ".split(" ")[5];
            System.out.println("split result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Поймали арифметическую ошибку");
        } catch (Exception e) {
            System.out.println("Поймали ошибку");
        } finally {
            System.out.println("finallу running always");
        }
        // System.out.println("Expression result: " + sum);
        //}

    }

    static double square(double x) {
        System.out.println("Возводим в квадрат");
        return x * x;
    }

}

