package pl.sdacademy.intermediate.basic.basic1;

/**
 * @author Piotr Zietek
 */
public class ArrayBubbleSorter {

    static int[] bubbleSort(int[] array) {
        int length = array.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                // if previous element is greater than current element - SWAP
                if (array[j - 1] > array[j]) {
                    // save the previous element in temp variable
                    temp = array[j - 1];
                    // assign current element to the previous element
                    array[j - 1] = array[j];
                    // assign saved previous element to current
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
