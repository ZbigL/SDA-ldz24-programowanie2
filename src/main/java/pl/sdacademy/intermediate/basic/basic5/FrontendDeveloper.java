package pl.sdacademy.intermediate.basic.basic5;

/**
 * @author Piotr Zietek
 */
public class FrontendDeveloper extends Developer {

    private String javascriptFramework;

    public FrontendDeveloper(String name, String company, double salary, String javascriptFramework) {
        super(name, company, salary);
        this.javascriptFramework = javascriptFramework;
    }

    @Override
    protected void makeCode() {
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " in " + this.javascriptFramework);
    }
}
