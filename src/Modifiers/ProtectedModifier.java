package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ProtectedModifier {
    protected int protectedField = 10;
    protected int publicField = 20;
    protected int privateField = 30;
    protected int protectedMethod = 40;
    protected int publicMethod = 50;

    public static void main(String[] args) {
        ProtectedModifier p = new ProtectedModifier();
        System.out.println(p.protectedField);
        System.out.println(p.publicField);
        System.out.println(p.privateField);

        //getProtectedField is a private method, so it can be accessed from the same package or subclass

        System.out.println(getProtectedField(p.protectedField));
    }
    private static int getProtectedField(int number) {
        int result = number * 2;
        return result;
    }

}
/*
子类能访问 protected 修饰符声明的方法和变量，这样就能保护不相关的类使用这些方法和变量。

protected 修饰符可以修饰成员变量和成员方法，但不能修饰类。

protected 修饰符的成员只能被同一个包中的类和子类访问，不能被其他包访问。

protected 修饰符的成员变量和成员方法只能在同一个类中访问，不能被其他类访问。
 */
class Speaker{}
class Animal{
    protected boolean isAlive(Speaker speaker){
        return false;
    }
}

class Dog extends Animal{
    protected boolean isAlive(Speaker speaker){
        return true;
    }
}
