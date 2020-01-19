package pl.sdacademy.intermediate.warmup.warmup1;

/**
 * @author Piotr Zietek
 */
public class WarmUp1 {

    public static void main(String[] args) {

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);

        System.out.println(person1.toString());
        System.out.println();
        System.out.println(person2.toString());
    }

}
