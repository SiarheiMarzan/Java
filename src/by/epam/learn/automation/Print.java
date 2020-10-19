// 3.Print the specified number of random numbers with or without a new line transition

package by.epam.learn.automation;

public class Print {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}