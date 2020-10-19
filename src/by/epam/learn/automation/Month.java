//5. Enter a number from 1 to 12. Display the name of the month corresponding to this date on the console.
// Perform a check of the correctness of entering numbers.

package by.epam.learn.automation;

import java.util.Scanner;

public class Month {
    static void setMonth(int a){
        String[] month = {"January", "February", "March", "April", "May", "June",
                 "July", "August", "September", "October", "November", "December"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("This is a month - " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such month");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int n = sc.nextInt();
        setMonth(n);
    }
}