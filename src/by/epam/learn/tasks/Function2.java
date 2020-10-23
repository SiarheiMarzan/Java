package by.epam.learn.tasks;

import java.util.Scanner;

public class Function2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input variable a: ");
        int a = scan.nextInt();
        System.out.println("Input variable b: ");
        int b = scan.nextInt();
        System.out.println("Input variable c: ");
        int c = scan.nextInt();
        int z = 0;
        z = ((a - 3) + b / 2 ) + c;
        System.out.println("Value function z: " + z);


    }
}


