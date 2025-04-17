package Reflection.Class;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassLoader03 {
    public static void main(String[] args) {
        //clinit 依次自动收集类中静态变量和静态方法代码中的语句,并合并
//        clinit{
//            num = 300;
//            num  = 100;
//            }

//        new B();//构造器会被执行
        System.out.println(B.num);
    }
}
class B{
    static {

        System.out.println("B 静态代码块被执行");
    }
    static int num = 10;
    //如果没有构建对象就不会调用构造器
    public B(){
        System.out.println("B 构造器被执行");
    }


}