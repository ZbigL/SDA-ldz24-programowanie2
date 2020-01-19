package pl.sdacademy.intermediate.basic.basic9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basic9Streams {
    public static void main(String[] args) {
        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!
                .forEach(name -> System.out.println("Person: " + name + " is adult."));

        allPersons
                .stream()
                .map(Person::getName)
                .sorted() // natural order, alfabetycznie
                .forEach(name -> System.out.println("Hello, " + name));

        allPersons
                .stream()
                .map(Person::getName)
                .sorted(Comparator.reverseOrder()) // alfabetycznie, odwrotnie
                .forEach(name -> System.out.println("Hello, " + name));

        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge)) // natural order (od najmłodszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed()) // natural order, odwrotnie (od najstarszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparing(Person::getName)) // natural order, alfabetycznie, inaczej zrobione
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName())) // ekwiwalent powyższego, „na piechotę”
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        List<Person> adultsOnly = allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
        System.out.println(adultsOnly);

        String namesJoinedByHyphen = allPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(" – "));
        System.out.println(namesJoinedByHyphen);

        List<Person> personsFromWarsaw = allPersons
                .stream()
                .peek(person -> System.out.println(person.getName()+" "+person.getPlaceOfBirth()))
                .filter(person -> person.getPlaceOfBirth().equals("Warszawa"))
                .collect(Collectors.toList());
        System.out.println(personsFromWarsaw);

    }
}
