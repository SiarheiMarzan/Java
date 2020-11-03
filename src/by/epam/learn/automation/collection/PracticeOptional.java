package by.epam.learn.automation.collection;

import java.util.*;

public class PracticeOptional {
    public static void main(String[] args) {
        new PracticeOptional().run();
    }

    private void run() {
        task1(strings1);
        task2(12345);
        task3(strings1);
        task4(strings2);
        task5(strings2);
        isCorrect("((()))");
    }

    // 1. В массиве содержатся строки, записать их в список.
    // Вывести строки в обратном порядке.
    public String[] task1(String[] strings) {
        String[] result = null;
        return result;
    }

    // 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры
    //    идут в обратном порядке.
    public int task2(int number) {
        int result = 0;
        return result;
    }

    // 3. В массиае содержатся строки, записать в список ArrayList.
    //  Выполнить сортировку строк, используя метод sort() из класса Collections
    public List<String> task3(String[] strings) {
        List<String> list = new ArrayList<>();
        return list;
    }

    // 4. Задан массиа со словами на английском языке. Выделить все различные слова.
    //    Слова, отличающиеся только регистром букв, считать одинаковыми.
    //    Использовать класс HashSet.
    public Set<String> task4(String[] strings) {
        Set<String> set = new HashSet<>();
        return set;
    }

    // 5. Задан массив со словами на английском языке. Выделить все различные слова.
    //    Для каждого слова подсчитать частоту его встречаемости. Слова, отличаю-
    //    щиеся регистром букв, считать различными. Использовать класс HashMap.
    public Map<String, Integer> task5(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        return result;
    }

    // 6. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
    //    Проверить правильность расстановки скобок. Использовать стек
    public boolean isCorrect(String line) {
        Deque<Character> stack = new ArrayDeque<>();
        return true; //stack.isEmpty();
    }

    private String[] strings1 = {"Первая", "Вторая", "Третья", "Еще одна", "Почти последняя", "Последняя"};
    private String[] strings2 = {"Hello", "World", "Line", "Another line", "hello", "world", "hello", "line", "string", "text"};

}
