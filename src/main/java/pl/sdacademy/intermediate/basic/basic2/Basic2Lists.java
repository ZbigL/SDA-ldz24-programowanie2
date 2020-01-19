package pl.sdacademy.intermediate.basic.basic2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Piotr Zietek
 */
public class Basic2Lists {

    public static void main(String[] args) {
        Person piotr = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person adam = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person ala = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        Person juliusz = new Person("Juliusz", "Slowacki", "Krakow", 40, 10203040);
        Person tomasz = new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523);

        List<Person> personList = new ArrayList();
        personList.add(piotr);
        personList.add(adam);
        personList.add(ala);
        personList.add(juliusz);
        personList.add(tomasz);

        printInfo(personList);
        System.out.println("*********************************************************");

        printOlderThanTwenty(personList);
        System.out.println("*********************************************************");

        printPhoneDividableByTwo(personList);
        System.out.println("*********************************************************");

        printAgeSum(personList);
        System.out.println("*********************************************************");

        List<Person> personListCopy = new ArrayList<>(personList);
        personList.remove(ala);
        printAgeSum(personList);
        printAgeSum(personListCopy);
        System.out.println("*********************************************************");

        System.out.println("Size of first list: " + personList.size());
        System.out.println("Size of second list: " + personListCopy.size());

        showArrayListPerformance();
        showLinkedListPerformance();
    }

    private static void printInfo(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static void printOlderThanTwenty(List<Person> personList) {
        for (Person person : personList) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }
    }

    private static void printPhoneDividableByTwo(List<Person> personList) {
        for (Person person : personList) {
            if (person.getPhone() % 2 == 0) {
                System.out.println(person);
            }
        }
    }

    private static void printAgeSum(List<Person> personList) {
        int sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        System.out.println("Sum of ages: " + sum);
    }

    private static void showArrayListPerformance() {

        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for(int i = 200_000; i < 500_000; i++) {
            arrayList.remove(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("ArrayList performance: " + (stopTime - startTime) + " ms");
    }

    private static void showLinkedListPerformance() {

        List<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for(int i = 200_000; i < 500_000; i++) {
            linkedList.remove(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("LinkedList performance: " + (stopTime - startTime) + " ms");
    }
}
