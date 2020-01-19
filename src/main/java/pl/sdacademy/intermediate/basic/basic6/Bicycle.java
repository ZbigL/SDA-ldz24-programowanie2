package pl.sdacademy.intermediate.basic.basic6;

/**
 * @author Piotr Zietek
 */
public class Bicycle implements Vehicle {

    private static final int MAX_SPEED = 50;
    private static final int OFFSET = 5;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed = speed + OFFSET;
        } else {
            System.out.println("Bicycle cannot accelerate more than " + MAX_SPEED);
        }
    }
}
