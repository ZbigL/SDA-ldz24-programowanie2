package pl.sdacademy.intermediate.basic.basic6;

/**
 * @author Piotr Zietek
 */
public class Basic6Polymorphism {

    public static void main(String[] args) {
        Vehicle motorbike = new Motorbike();
        Vehicle bicycle = new Bicycle();
        Vehicle rocket = new Rocket();

        int n = 12;
        System.out.println("Moving motorbike " + n + " times faster: " + moveNTimesFast(motorbike, n));
        System.out.println("Moving bicycle " + n + " faster: " + moveNTimesFast(bicycle, n));
        System.out.println("Moving rocket " + n + " faster: " + moveNTimesFast(rocket, n));
    }

    private static int moveNTimesFast(Vehicle vehicle, int times) {
        for (int i = 0; i < times; i++) {
            vehicle.accelerate();
        }
        return vehicle.getSpeed();
    }

}
