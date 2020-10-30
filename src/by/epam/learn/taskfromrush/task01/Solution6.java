package by.epam.learn.taskfromrush.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
Положительное и отрицательное число
*/

public class Solution6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        if (num < 0) num++;
        else if (num > 0) num *= 2;
        System.out.println(num);

    }

}
