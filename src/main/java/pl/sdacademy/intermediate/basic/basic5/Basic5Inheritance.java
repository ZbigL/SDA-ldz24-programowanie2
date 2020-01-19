package pl.sdacademy.intermediate.basic.basic5;

import java.util.Random;

/**
 * @author Piotr Zietek
 */
public class Basic5Inheritance {

    public static void main(String[] args) {
        Developer backendDeveloper = new BackendDeveloper("Piotr", "Ericsson", 0.5, "Java");
        Developer frontendDeveloper = new FrontendDeveloper("Adam", "SDA", 999.9, "AngularJS");
        Developer mobileDeveloper = new MobileDeveloper("Ania", "Google", 100000.0, "Android");

        Developer unknownDeveloper = new Developer("Some guy", "Some company", new Random().nextDouble() * 1000) {

            @Override
            protected void makeCode() {
                System.out.println("I have no idea what I'm coding " + super.salary);
            }
        };

        backendDeveloper.makeCode();
        frontendDeveloper.makeCode();
        mobileDeveloper.makeCode();
        unknownDeveloper.makeCode();
    }

}
