package by.epam.learn.taskfromrush.task02;

import java.util.Random;

public class Company {
    private Plane[] plane;

    public Company() {
        plane = new Plane[10];
    }

    public void sortPlane() {
        Plane temp = new Plane();
        for (int i = 0; i < plane.length - 1; i++) {
            for (int j = 0; j < plane.length - 1; j++) {
                if (plane[j].getFuelRate() > plane[j + 1].getFuelRate()) {
                    temp = plane[j + 1];
                    plane[j + 1] = plane[j];
                    plane[j] = temp;
                }
            }
        }
    }

    public void printPlane(Plane[] taxi) {
        for (Plane i : plane) {
            System.out.println("Скорость самолёта " + i.getSpeed()
                    + " расход топлива " + i.getFuelRate());
        }
    }

    public void setPlane() {
        Random rand = new Random();
        for (int i = 0; i < plane.length; i++) {
            plane[i] = new Plane(rand.nextInt(5) + 7, 20 * (i + 1));
        }
    }

    public Plane[] getPlane() {
        return (Plane[]) plane;
    }

    public void findBySpeed(int first, int end) {
        int count = 0;
        for (Plane i : plane) {
            if (i.getSpeed() > first && i.getSpeed() < end) {
                count++;
                System.out.println("Скорость самолёта " + i.getSpeed()
                        + " расход топлива " + i.getFuelRate());
            }
        }
        if (count == 0)
            System.out.println(" Подходящих по скорости самолётов нет в нашей авиакомпании.");
    }

    public static void sortCompany() {


    }

    public static void printCompany(Plane[] plane2) {


    }

}
