package by.epam.learn.taskfromrush.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
*/

public class Solution8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a % 400 == 0)
            System.out.println("количество дней в году: " + 366);
        else if (a % 100 == 0)
            System.out.println("количество дней в году: " + 365);
        else if (a % 4 == 0)
            System.out.println("количество дней в году: " + 366);
        else
            System.out.println("количество дней в году: " + 365);


    }
}
