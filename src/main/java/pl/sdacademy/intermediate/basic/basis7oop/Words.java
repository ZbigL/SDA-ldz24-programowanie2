package pl.sdacademy.intermediate.basic.basis7oop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Words {
    public static List<String> wordsList = new LinkedList<String>(Arrays.asList(new String[]{"lalka", "trawnik","morze", "ogrodnik", "kuchnia", "pszczelarz"}));

    // losowanie słowa

    public static String drawWord() {
        Random r = new Random();
        int s = wordsList.size();
        int i = r.nextInt(s);
        String word = wordsList.get(i);
        wordsList.remove(i);
        return word;
    }


}
