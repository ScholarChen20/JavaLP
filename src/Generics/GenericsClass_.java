package Generics;

import org.junit.jupiter.api.Test;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class GenericsClass_ {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Box<Double> doubleBox = new Box<Double>();
        integerBox.add(new Integer(10));
        integerBox.add(new Integer(20));
        integerBox.add(new Integer(30));
        integerBox.add(new Integer(40));
    }

    @Test
    public void addAndGet() {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
    // Output:}
}
class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}