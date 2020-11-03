package by.epam.learn.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class CalculExpres34 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            File file = new File("c:\\data\\value.txt");
//            File file = new File("c:\\ata\\value.txt");
            //создаем объект FileReader для объекта File
            FileReader fread = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fread);
            // считаем сначала первую строку
            String line = reader.readLine();
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
                line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//
//////        //int a = (int)(Math.random()*(200+1)) - 100;
////            System.out.println(a);
//////       // int b = (int)(Math.random()*(200+1)) - 100;
////            System.out.println(b);
//////       // int c = (int)(Math.random()*(200+1)) - 100;
////            System.out.println(c);
//////
        if ((a * b == 0) || ((square(b) + 4 * a * c) < 0)) {
            System.out.println("false");
        } else {
            double sum = ((b + Math.sqrt(square(b) + 4 * a * c)) / (2 * a)) - ((Math.pow(a, 3) * c)
                    + Math.pow(b, -2));
            System.out.println("Expression result: " + sum);
        }
    }

    static double square(double x) {
        System.out.println("Возводим в квадрат");
        return x * x;
    }

}

