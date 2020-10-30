package by.epam.learn.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CalculExpress {
    public static void main(String[] args) throws IOException {
        calculatingFormula();
    }

    static double square(double x) {
        return x * x;
    }

    static void calculatingFormula() throws IOException {
        File file = new File("C:\\data\\workjava\\Java\\src\\by\\epam\\learn\\tasks\\value.txt");
        FileReader readingFromFile = new FileReader(file);
        BufferedReader reader = new BufferedReader(readingFromFile);
        String line = reader.readLine();
        int a = 0, b = 0, c = 0;
        int number;
        for (number = 1; line != null; number++) {
            if (number == 1) {
                a = Integer.parseInt(line);
            } else if (number == 2) {
                b = Integer.parseInt(line);
            } else if (number == 3) {
                c = Integer.parseInt(line);
            }
            System.out.println(line);
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
            System.out.println("Entered a value that does not meet the input condition!");
        } else {
            double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                    + Math.pow(b, -2));
            System.out.println("Expression result: " + sum);
        }
    }
}

