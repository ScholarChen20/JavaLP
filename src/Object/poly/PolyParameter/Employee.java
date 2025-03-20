package Object.poly.PolyParameter;

public class Employee {
    private String name;
    private double slavery;

    public Employee(String name, double slavery) {
        this.name = name;
        this.slavery = slavery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlavery(double slavery) {
        this.slavery = slavery;
    }
    public double getAnnual() {
        return 12  * slavery;
    }

}
