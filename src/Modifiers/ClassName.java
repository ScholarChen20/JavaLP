package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassName {
    /*
    1.default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
    2.private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
    3.public : 对所有类可见。使用对象：类、接口、变量、方法
    4.protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
     */
    private boolean myFlag = false;
    static final double weeks = 9.5;
    protected static final int BOXWIDTH = 42;
    public static void main(String[] arguments) {
        System.out.println("Hello, world!");
        // 方法体
        System.out.println("weeks = " + weeks
                + ", BOXWIDTH = " + BOXWIDTH);
        // 访问私有属性
        // System.out.println("myFlag = " + myFlag);
        // 尝试修改私有属性
        // myFlag = true;
        // System.out.println("After modification: "
//                + ", myFlag = " + myFlag);
    }
}
