package Object.poly.PolyParameter;

public class Worker extends Employee{

    public Worker(String name, double slavery) {
        super(name, slavery);
    }

    public void work(){
        System.out.println("普通员工"+getName()+"Working...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
