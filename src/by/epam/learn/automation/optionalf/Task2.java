package by.epam.learn.automation.optionalf;

import java.util.Arrays;
import java.util.Collections;

// Print the numbers in ascending (descending) order of their length values.
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 1, 3};
        Arrays.sort(arr);
        System.out.println("Numbers in ascending order: " + Arrays.toString(arr));
        Integer[] arra = {10, 5, 6, 1, 3};
        Arrays.sort(arra, Collections.reverseOrder());
        System.out.println("Numbers in descending order: " + Arrays.toString(arra));
    }
}
