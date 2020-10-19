//4. Enter integers as command-line arguments, calculate their sums (products), and output
        // the result to the console.

package by.epam.learn.automation;

public class Integers {
    public static void main(String[] args){
        int sum = 0;
        int comp = 1;
        for (int i = 0; i < args.length; i++) {
            int parsed = Integer.parseInt(args[i]);
            sum += parsed;
            comp *= parsed;
        }
        System.out.println(sum);
        System.out.println(comp);
    }}

