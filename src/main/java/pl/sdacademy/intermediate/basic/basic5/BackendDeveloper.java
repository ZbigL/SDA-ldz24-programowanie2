package pl.sdacademy.intermediate.basic.basic5;

/**
 * @author Piotr Zietek
 */
public class BackendDeveloper extends Developer {

    private String backendLanguage;

    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    protected void makeCode() {
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " in " + this.backendLanguage);
    }
}
