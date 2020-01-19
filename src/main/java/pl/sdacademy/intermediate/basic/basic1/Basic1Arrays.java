package pl.sdacademy.intermediate.basic.basic1;

import java.util.Arrays;

/**
 * @author Piotr Zietek
 */
public class Basic1Arrays {

    public static void main(String[] args) {
        int[] ascendingArray = ArrayInitializerHelper.initAscendingArray();
        int[] fibonacciArray = ArrayInitializerHelper.initFibonacciArray();
        int[] randomArray = ArrayInitializerHelper.initRandomArray();

        System.out.println("--> Printing initialized arrays ");
        System.out.println(Arrays.toString(ascendingArray));
        System.out.println(Arrays.toString(fibonacciArray));
        System.out.println(Arrays.toString(randomArray));
        System.out.println("----------------------------------");


        System.out.println("--> Printing arrays backwards ");
        printArrayBackwards(ascendingArray);
        printArrayBackwards(fibonacciArray);
        printArrayBackwards(randomArray);
        System.out.println("----------------------------------");

        System.out.println("--> Printing only odd numbers from arrays ");
        printOddNumbersFromArray(ascendingArray);
        printOddNumbersFromArray(fibonacciArray);
        printOddNumbersFromArray(randomArray);
        System.out.println("----------------------------------");

        System.out.println("--> Printing sum of elements at even indexes ");
        printEvenIndexElementsSum(ascendingArray);
        printEvenIndexElementsSum(fibonacciArray);
        printEvenIndexElementsSum(randomArray);
        System.out.println("----------------------------------");

        System.out.println("--> Printing sum of elements greater than 10 ");
        printSumOfElementsGreaterThanTen(ascendingArray);
        printSumOfElementsGreaterThanTen(fibonacciArray);
        printSumOfElementsGreaterThanTen(randomArray);
        System.out.println("----------------------------------");

        System.out.println("--> Printing bubble-sorted arrays ");
        printBubbleSortedArray(ascendingArray);
        printBubbleSortedArray(fibonacciArray);
        printBubbleSortedArray(randomArray);
        System.out.println("----------------------------------");
    }

    private static void printArrayBackwards(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printOddNumbersFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static void printEvenIndexElementsSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum of elements at even indexes: " + sum);
    }

    private static void printSumOfElementsGreaterThanTen(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                sum += array[i];
            }
        }
        System.out.println("Sum of elements greater than 10: " + sum);
    }

    private static void printBubbleSortedArray(int[] array) {
        int[] sortedArray = ArrayBubbleSorter.bubbleSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
