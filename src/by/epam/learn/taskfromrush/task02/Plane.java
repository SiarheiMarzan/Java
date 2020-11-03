package by.epam.learn.taskfromrush.task02;

public class Plane {
    private int fuelRate;
    private float speed;

    public Plane() {

    }

    public Plane(int placeCount, float speed) {
        this.fuelRate = placeCount;
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(int fuelRate) {
        this.fuelRate = fuelRate;

    }
}
