package by.epam.learn.tasks;

import java.io.*;


public class CalculExpres35 {
    public static void main(String[] args) throws IOException {
        method();
    }

    static double square(double x) {
        System.out.println("Возводим в квадрат");
        return x * x;
    }

    public static void method() throws IOException {
        File file = new File("C:\\data\\workjava\\Java\\src\\by\\epam\\learn\\tasks\\value.txt");
        FileReader fread = new FileReader(file);
        BufferedReader reader = new BufferedReader(fread);
        String line = reader.readLine();
        int a = 0, b = 0, c = 0;
        int number = 0;
        while (line != null) {
            number++;
            if (number == 1) {
                a = Integer.parseInt(line);
            } else if (number == 2) {
                b = Integer.parseInt(line);
            } else if (number == 3) {
                c = Integer.parseInt(line);
            }
            System.out.println(line);
            // считываем остальные строки в цикле
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
            System.out.println("false");
        } else {
            double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                    + Math.pow(b, -2));
            System.out.println("Expression result: " + sum);
        }
    }
}

