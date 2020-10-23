package by.epam.learn.automation.optionalf;
//Output to the console those numbers whose length is less than (greater than) the average
// length for all numbers, as well as the length.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        double avg = 0;
        String[] arr = line.split(" ");
        for (String s : arr) {
            avg += s.length();
        }
        if (arr.length > 0) avg /= arr.length;
        System.out.println("\nNumbers with a length greater than the average:");
        for (String s : arr) {
            if (s.length() > avg) System.out.println(s + " length: " + s.length());
        }
        System.out.println("Numbers with a length less than the average:");
        for (String s : arr) {
            if (s.length() < avg) System.out.println(s + " length: " + s.length());
        }
    }
}



