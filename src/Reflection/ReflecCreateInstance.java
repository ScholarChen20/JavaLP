package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /**
         * 1.先获取到User类的Class对象
         * 2，通过public的无参构造器创建实例
         * 3，通过public的有参构造器创建实例
         * 4，通过非public的有参构造器创建实例
         */
        Class<?> aClass = Class.forName("Reflection.User");

        Object o = aClass.newInstance();
        System.out.println(o);


        Constructor<?> constructors = aClass.getConstructor(String.class);
        Object hsp = constructors.newInstance("hsp");
        System.out.println("hsp1="  + hsp);


        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        //使用反射可以访问private构造器/方法/属性，反射面前，都是纸老虎
        Object object = declaredConstructor.newInstance("张三丰", 1);
        System.out.println("hsp2="  + object);

    }
}
class User{
    private String name = "hsp";
    private int age = 10;
    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public User(){

    }
    public User(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
