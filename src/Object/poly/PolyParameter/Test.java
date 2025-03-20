package Object.poly.PolyParameter;

/**
 * @version 0.1
 * @author  多态参数
 */
public class Test {
    public static void main(String[] args) {
        Worker haha = new Worker("haha", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        Test test = new Test();
//        test.showEmployee(haha);
//        test.showEmployee(milan);

        test.testWork(haha);
        test.testWork(milan);

    }

    public void showEmployee(Employee e){
        System.out.println(e.getAnnual());
    }

    //
    public void testWork(Employee e){
        if (e instanceof Manager){
            ((Manager) e).manage();
        }
        else if (e instanceof Worker){
            ((Worker) e).work();
        }
        else{
            System.out.println("没人工作");
        }
    }
}
