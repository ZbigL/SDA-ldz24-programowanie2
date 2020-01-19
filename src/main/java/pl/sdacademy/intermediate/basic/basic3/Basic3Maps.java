package pl.sdacademy.intermediate.basic.basic3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Piotr Zietek
 */
public class Basic3Maps {

    public static void main(String[] args) {

        String[] array = new String[] { "abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz" };

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        initMap(hashMap, array);
        initMap(linkedHashMap, array);

        System.out.println(hashMap.toString());
        System.out.println("---------------------------------------");
        System.out.println(linkedHashMap.toString());
        System.out.println("---------------------------------------");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("---------------------------------------");

        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("---------------------------------------");

        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
    }

    private static void initMap(Map<String, Integer> map, String[] array) {
        for (String element : array) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
    }

}
