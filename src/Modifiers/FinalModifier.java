package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FinalModifier {
    /*
    final 变量：final 修饰符通常和 static 修饰符一起使用来创建类常量。
     */
    final int value = 10;
    int age = 20;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

//    public void changeValue(){
//        value = 12; //将输出一个错误
//    }

    /*
    final 方法：final 修饰符通常和 static 修饰符一起使用来创建类方法。
     */

    public final int changeValue(){
        return age = 25; //将输出一个错误
    }
}
/*
父类中的 final 方法可以被子类继承，但是不能被子类重写。

声明 final 方法的主要目的是防止该方法的内容被修改。
 */
class Parent {
    public final void print() {
        System.out.println("Parent");
    }
}
//class Child extends Parent {
//   public final void print(){
//       System.out.println("Child");//base class method cannot be overridden
//   }
//}
