package by.epam.learn.tasks;

import java.io.*;


public class CalculExpress36 {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) throws IOException {
        //Инициализация переменных:
        initVariables();
        //Вычисление формулы:
        double calculationResult = calculation();
        //Выведение результата:
        printResult(calculationResult);

    }

    private static void printResult(double result) {
        System.out.println("Expression result: " + result);
    }

    private static Double calculation() {
        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
            System.out.println("Entered a value that does not meet the input condition!");
            return null;
        } else {
            double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                    + Math.pow(b, -2));
            return sum;
        }

    }

    private static void initVariables() {
        File file = new File("C:\\data\\workjava\\Java\\src\\value.txt");
        FileReader readingFromFile = null;
        try {
            readingFromFile = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(readingFromFile);
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int number = 0;
        do {
            number++;
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
        while (line != null);
    }

    static double square(double x) {
        return x * x;
    }


}

