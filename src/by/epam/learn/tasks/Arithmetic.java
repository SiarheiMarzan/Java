package by.epam.learn.tasks;

public class Arithmetic {
    public static void main(String args[]) {
        int arr[] = {5, 6};
        double sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum / arr.length);
    }
}


