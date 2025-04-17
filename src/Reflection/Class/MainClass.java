package Reflection.Class;

import java.io.Serializable;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class MainClass {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Class<Integer> integerClass = Integer.class;//整形
        Class<Integer[]> aClass = Integer[].class; //二维数组
        Class<Serializable> serializableClass = Serializable.class; //接口
        Class<Deprecated> deprecatedClass = Deprecated.class;//注解

        Class<Class> classClass = Class.class;

        System.out.println(stringClass);
        System.out.println(integerClass);
        System.out.println(aClass);
        System.out.println(serializableClass);
        System.out.println(deprecatedClass);

    }
}
