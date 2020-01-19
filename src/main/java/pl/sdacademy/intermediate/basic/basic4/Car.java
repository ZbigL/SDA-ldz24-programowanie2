package pl.sdacademy.intermediate.basic.basic4;

import java.util.Objects;

/**
 * @author Piotr Zietek
 */
public class Car {

    private String name;
    private String model;
    private String VIN;

    public Car(String name, String model, String VIN) {
        this.name = name;
        this.model = model;
        this.VIN = VIN;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getVIN() {
        return VIN;
    }

    @Override
    public String toString() {
        return name + " " + model + " " + VIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }
}
