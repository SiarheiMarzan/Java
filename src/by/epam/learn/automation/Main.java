package by.epam.learn.automation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /* //1. Greet any user when entering their name through the command line.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name); */


        //2. Display command line arguments in reverse order in a console window.
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Enter the reverse sequence of numbers: " + mirror);   */

        // 3. Print the specified number of random numbers with or without a new line transition.
        /*int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }              */

        // 4. Enter integers as command-line arguments, calculate their sums (products), and output
        // the result to the console.
        /*
        int sum = 0;
        int comp = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            comp *= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(comp);             */

    }
}
