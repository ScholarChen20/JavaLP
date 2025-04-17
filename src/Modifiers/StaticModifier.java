package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class StaticModifier {
    /*
    static 修饰符，用来修饰类方法和类变量。
    final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
    abstract 修饰符，用来创建抽象类和抽象方法。
    synchronized 和 volatile 修饰符，主要用于线程的编程。
     */
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }
    public int count() {
         int count = 0;
//         static int count2 = 0;
        return count;//     静态变量也被称为类变量。局部变量不能被声明为 static 变量。
    }
    StaticModifier() {
        StaticModifier.addInstance();
    }

    public static void main(String[] arguments) {
        /*
        static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。
        静态变量也被称为类变量。局部变量不能被声明为 static 变量。
         */
        System.out.println("Starting with " +
                StaticModifier.getCount() + " instances");
        for (int i = 0; i < 500; ++i){
            new StaticModifier();
        }
        System.out.println("Created " +
                StaticModifier.getCount() + " instances");
    }
}