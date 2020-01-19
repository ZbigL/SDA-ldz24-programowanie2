package pl.sdacademy.intermediate.basic.basic1;

import java.util.Random;

/**
 * @author Piotr Zietek
 */
class ArrayInitializerHelper {

    static int[] initAscendingArray() {
        int[] ascendingArray = new int[10];
        for (int i = 0; i < ascendingArray.length; i++) {
            ascendingArray[i] = i;
        }
        return ascendingArray;
    }

    static int[] initFibonacciArray() {
        int[] fibonacciArray = new int[10];
        for (int i = 0; i < fibonacciArray.length; i++) {
            if (i < 2) {
                fibonacciArray[i] = i;
            } else {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }
        return fibonacciArray;
    }

    static int[] initRandomArray() {
        int[] randomArray = new int[10];
        int min = 0;
        int max = 31;
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(max - min) + min;
        }
        return randomArray;
    }
}
