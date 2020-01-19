package pl.sdacademy.intermediate.basic.basic4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Piotr Zietek
 */
public class Basic4Sets {

    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080​");
        Car car2 = new Car("Audi","A3", "1FTSW21R08EC46917​");
        Car car3 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253​");
        Car car4 = new Car("Audi", "A3", "1FMFU17538LA84228​");
        Car car5 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253​");
        Car car6 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080​");

        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);

        for (Car car : carSet) {
            System.out.println(car.toString());
        }
        System.out.println("-----------------------------");

        carSet = new LinkedHashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);

        for (Car car : carSet) {
            System.out.println(car.toString());
        }
        System.out.println("-----------------------------");

    }

}
