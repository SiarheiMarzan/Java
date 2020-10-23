//Optional Task 1.Find the shortest and longest number. Print the found numbers and their length

package by.epam.learn.automation;

import java.util.Scanner;

public class FindShortestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.next();
        }
        solve(arr);
    }

    public static void solve(String[] arr) {
        int min = arr[0].length();
        int max = 0;
        for (String val : arr) {
            if (val.length() > max) max = val.length();
            else if (val.length() < min) min = val.length();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max)
                System.out.println("Max number is " + arr[i] + " his length " + arr[i].length());
            else if (arr[i].length() == min)
                System.out.println("Min number is " + arr[i] + " his length " + arr[i].length());
        }
    }
}
