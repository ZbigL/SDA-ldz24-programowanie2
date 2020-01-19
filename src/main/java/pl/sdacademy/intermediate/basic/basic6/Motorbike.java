package pl.sdacademy.intermediate.basic.basic6;

/**
 * @author Piotr Zietek
 */
public class Motorbike implements Vehicle {

    private static final int MAX_SPEED = 300;
    private static final int OFFSET = 25;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else {
            System.out.println("Morotbike cannot accelerate more than " + MAX_SPEED);
        }
    }
}
