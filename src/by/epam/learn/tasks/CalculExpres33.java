package by.epam.learn.tasks;

public class CalculExpres33 {
        public static void main(String[] args) {
        int a = (int)(Math.random()*(200+1)) - 100;
            System.out.println(a);
        int b = (int)(Math.random()*(200+1)) - 100;
            System.out.println(b);
        int c = (int)(Math.random()*(200+1)) - 100;
            System.out.println(c);

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

