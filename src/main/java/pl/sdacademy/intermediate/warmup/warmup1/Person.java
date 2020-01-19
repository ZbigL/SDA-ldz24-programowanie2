package pl.sdacademy.intermediate.warmup.warmup1;

/**
 * @author Piotr Zietek
 */
public class Person {

    private String name;
    private String surname;
    private String placeOfBirth;
    private int age;
    private long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        /*return name + " " + surname + " (ur. " + (LocalDate.now().getYear() - age) + " r.)\n"
                + "m. ur.: " + placeOfBirth + "\n"
                + "tel: " + phone;*/

        return String
                .format("%s %s (ur. %d r.)\nm. ur.: %s\ntel: %d", name, surname, (2020 - age), placeOfBirth, phone);
    }
}