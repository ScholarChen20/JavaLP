package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Synchronized_ {
    /*
    synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
     */
    public synchronized void method1() {
        System.out.println("Method 1");
    }
    public synchronized void method2() {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Synchronized_ s = new Synchronized_();
        s.method1();
        s.method2();
        // 两个方法不能同时执行，因为它们被 synchronized 修饰。
    }
}
