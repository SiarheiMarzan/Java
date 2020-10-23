//Main task.4. Enter integers as command-line arguments, calculate their sums (products), and output
// the result to the console.

package by.epam.learn.automation;

public class Integers1 {
    public static void main(String[] args) {
        int sum = 0;
        int comp = 1;
        System.out.println("Входные параметры: ");
        if (args.length == 0) {
            System.out.println("ничего ");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Входной аргумент №" + (i + 1) + " равен " + args[i]);
        }

        for (int i = 0; i < args.length; i++) {
            int parsed = Integer.parseInt(args[i]);
            sum += parsed;
            comp *= parsed;
        }
        System.out.println("Выходные параметры: ");
        System.out.println("Выходной параметр №1 (сумма) " + sum);
        System.out.println("Выходной параметр №1 (произведение) " + comp);
    }
}

