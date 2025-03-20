package Object.toString;

public class toString {
    public static void main(String[] args) {
        Master master = new Master("lala","worker",21);
        System.out.println(master.toString()+" ____ "+master.hashCode());

    }
}
class Master{
    private String name;
    private String job;
    private double sal;

    public Master(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString(){
        return "Master{"+name+","+job+","+sal+"}";
    }
}