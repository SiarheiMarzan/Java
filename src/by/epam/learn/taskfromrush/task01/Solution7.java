package by.epam.learn.taskfromrush.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        if (num == 1){
            System.out.println("понедельник");
        }else if (num == 2){
            System.out.println("вторник");
        }else if (num == 3){
            System.out.println("среда");
        }else if (num == 4){
            System.out.println("четверг");
        }else if (num == 5){
            System.out.println("пятница");
        }else if (num == 6){
            System.out.println("суббота");
        }else if (num == 7){
            System.out.println("воскресенье");
        }else {
            System.out.println("такого дня недели не существует");
        }//напишите тут ваш код

    }
}
