package by.epam.learn.automation;

public class Main {

    public static void main(String[] args) {
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
