package pl.sdacademy.intermediate.warmup.warmup2;

/**
 * @author Piotr Zietek
 */
public class WarmUp2 {

    public static void main(String[] args) {
        String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };

        int totalLength = findTotalLength(array);

        System.out.println("Sum of all elements length: " + totalLength);
    }

    public static int findTotalLength(String[] array) {
        int totalLength = 0;
        for (int i = 0; i < array.length; i++) {
            totalLength = totalLength + array[i].length();
        }/*
        for (String element : array) {
            totalLength += element.length();
        }*/
        return totalLength;
    }


}
