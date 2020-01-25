package pl.sdacademy.intermediate.complex.complex1;

/**
 * @author Zbigniew Lemiesz
 */

public class IntRange {
    // stwórz klasę IntRange z polami min i max oraz metodą contains(int num),
    // która sprawdza, czy num zawiera się w zakresie; zakres przyjmij >= min, <= max)

    int min;
    int max;

    public IntRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(int num) {
        return (min <= num && num <= max);
    }

}
