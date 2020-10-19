//2.Display command-line arguments in the console window in reverse order.

package by.epam.learn.automation;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        //2. Display command line arguments in reverse order in a console window.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Enter the reverse sequence of numbers: " + mirror);
    }
}
