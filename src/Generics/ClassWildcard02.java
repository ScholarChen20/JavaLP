package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassWildcard02 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        //getUperNumber(name);//1
        getUperNumber(age);//2
        getUperNumber(number);//3

//        getSuperNumber(name);//4
//        getSuperNumber(age);//5  //编译错误，类型不匹配，List<Integer>不能赋值给List<? super Number>。
        getSuperNumber(number);//6

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
    /*
     * 1.编译错误，类型不匹配，List<String>不能赋值给List<?>。
     * 2.编译通过，但是运行时报错，ClassCastException: java.lang.Integer cannot be cast to java.lang.Number。
     * 3.编译通过，运行正常，输出data :314。
     */
    //getUperNumber可以接受Number及其子类，但是不能接受Number及其父类。
    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
    //super代表下界是否也能使用呢？
    //getSuperNumber可以接受Number及其父类，但是不能接受Number及其子类。比如List<Integer>不能赋值给List<? super Number>。
    public static void getSuperNumber(List<? super Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
