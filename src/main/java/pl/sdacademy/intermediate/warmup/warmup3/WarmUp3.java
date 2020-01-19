package pl.sdacademy.intermediate.warmup.warmup3;

/**
 * @author Piotr Zietek
 */
public class WarmUp3 {

    public static void main(String[] args) {
        int[] array = new int[] { -2, 3, 1, 23, -9, 0, 12, 6, -4 };
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("MIN: " + min + ", MAX: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
