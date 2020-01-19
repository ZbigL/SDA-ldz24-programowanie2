package pl.sdacademy.intermediate.basic.basic5;

/**
 * @author Piotr Zietek
 */
public class MobileDeveloper extends Developer {

    private String mobileOs;

    public MobileDeveloper(String name, String company, double salary, String mobileOs) {
        super(name, company, salary);
        this.mobileOs = mobileOs;
    }

    @Override
    protected void makeCode() {
        System.out.println(super.name + " is coding for " + super.company + " for " + super.salary + " in " + this.mobileOs);
    }
}
