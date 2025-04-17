package Generics;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class About {
    public static void main(String[] args) {
        System.out.println("About Generics");
        /*
        Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
        泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
         */

        /*
         java 中泛型标记符：
         E - Element (在集合中使用，因为集合中存放的是元素)
         T- Type（Java 类）
         K - Key（键）
         V - Value（值）
         N - Number（数值类型）
         ？ - 表示不确定的 java 类型
         */
        //写一个泛型修饰的类
        class MyClass<T> {
            private T value;

            public MyClass(T value) {
                this.value = value;
            }

            public T getValue() {
                return value;
            }

            public void setValue(T value) {
                this.value = value;
            }
        }

        //使用泛型类
        MyClass<String> myClass = new MyClass<>("Hello World");
        System.out.println(myClass.getValue()); //输出 Hello World

        //泛型类中的方法
        class MyClass2<T> {
            private T value;

            public MyClass2(T value) {
                this.value = value;
            }

            public T getValue() {
                return value;
            }

            public void setValue(T value) {
                this.value = value;
            }

            public void printValue(T value) {
                System.out.println(value);
            }
        }

        MyClass2<String> myClass2 = new MyClass2<>("Hello World");
        myClass2.printValue("Hello World"); //输出 Hello World
    }
}
