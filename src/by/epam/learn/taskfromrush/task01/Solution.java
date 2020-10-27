package by.epam.learn.taskfromrush.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age1 = Integer.parseInt(reader.readLine());
        int age2 = Integer.parseInt(reader.readLine());
        System.out.println(name +" через "+ age1+" получает "+ age2 +" лет.");

    }
}
