//Find a number in which the number of different digits is minimal.
// If there are several such numbers, find the first one.

package by.epam.learn.automation.optionalf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Elem %d: ", i);
            arr[i] = scan.nextInt();
        }
        System.out.println("\n" + Arrays.toString(arr));
        foo(arr);
    }

    private static void foo(int[] arr) {
        int min = diffNum(arr[0]);
        int minElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (diffNum(arr[i]) < min) {
                min = diffNum(arr[i]);
                minElem = arr[i];
            }
        }
        System.out.printf("Elem: %d", minElem);
    }

    private static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while (x > 0) {
            nums.add(x % 10);
            x /= 10;
        }
        return nums.size();
    }
}

