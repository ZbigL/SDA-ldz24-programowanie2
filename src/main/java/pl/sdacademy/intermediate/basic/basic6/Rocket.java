package pl.sdacademy.intermediate.basic.basic6;

/**
 * @author Piotr Zietek
 */
public class Rocket implements Vehicle {

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private static final int OFFSET = 10000;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else {
            System.out.println("Rocket cannot accelerate more than " + MAX_SPEED);
        }
    }
}
