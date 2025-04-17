package BasicDataType.VariableType_;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class MemberVariable {
    /*
     * 成员变量
     * 成员变量是类的一部分，可以被类的所有方法访问。成员变量可以被声明为public、private、static等。
     * 成员变量可以被初始化，也可以被赋值。成员变量的作用域是整个类。
     * 成员变量的声明格式：数据类型 变量名 = 初始值;
     * 成员变量的访问格式：类名.变量名
     */
    private int a; // 私有成员变量a
    public String b = "Hello"; // 公有成员变量b

    // 这个成员变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    public MemberVariable(){}
    //在构造器中对name赋值
    public MemberVariable (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }


    public static void main(String[] args) {
        MemberVariable obj = new MemberVariable(); // 创建对象

        obj.a = 10; // 访问成员变量a，并设置其值为10
        System.out.println("a = " + obj.a);

        obj.b = "World"; // 访问成员变量b，并设置其值为"World"
        System.out.println("b = " + obj.b);

        MemberVariable empOne = new MemberVariable("RUNOOB");
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}
