package Reflection.Class;

import Object.poly.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassLoad_ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /**
         * 1.静态加载：
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className = scanner.next();
        switch (className){
            case "1":
                //静态加载在编译时加载相关的类，如果没有则报错，依赖性强
//                Dog dog = new Dog();
                System.out.println("Hello World");
                break;
            case "2":
                //反射-动态加载
                //运行时加载需要的类，如果运行时不用该类，即使不存在该类，则不报错，降低了依赖性
                Class<?> aClass = Class.forName("Person");
                Object o = aClass.newInstance();
                Method hi = aClass.getMethod("hi");
                hi.invoke(o);
                break;
            default:
                System.out.println("Invalid class");
                break;

        }
    }
}
