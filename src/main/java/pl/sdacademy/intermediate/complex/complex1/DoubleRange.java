package pl.sdacademy.intermediate.complex.complex1;

/**
 * @author Zbigniew Lemiesz
 */

public class DoubleRange {
    double min;
    double max;

    public DoubleRange(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(double num) {
        return (min < num && num < max);
    }
}
