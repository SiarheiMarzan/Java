package by.epam.learn.automation;

public class Main {

    public static void main(String[] args) {
        /*//1. Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name); */


        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цыфр: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Введите обраную последовательность цифр: " + mirror);*/
    }
}
