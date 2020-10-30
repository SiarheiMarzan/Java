package by.epam.learn.taskfromrush.task01;

// Допишите код метода setName, чтобы с его помощью установить значение private
// String fullName равное значению локальной переменной String fullName.
public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;//напишите тут ваш код
    }

    public static void main(String[] args) {

    }

}
