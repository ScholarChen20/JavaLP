package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class DefaultModifier {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
class MyClass {  // 默认访问修饰符

    int x = 10;  // 默认访问修饰符

    void display() {  // 默认访问修饰符
        System.out.println("Value of x is: " + x);
    }
}