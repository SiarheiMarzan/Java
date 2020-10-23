package by.epam.learn.tasks;

import java.util.Scanner;

public class Function1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input variable x: ");
        int x = scan.nextInt();
        System.out.println("Input variable y: ");
        int y = scan.nextInt();
        int z = 0;
        z = ((2 * x) + (y - 2) * 5);
        System.out.println("Value function z: " + z);


    }
}


