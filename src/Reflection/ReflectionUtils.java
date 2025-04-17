package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *
         */
        Class<?> aClass = Class.forName("Reflection.Person");
        System.out.println(aClass.getName());//获取全类名
        System.out.println(aClass.getSimpleName());//获取简单类名
        //获取所有public修饰的属性，包含本类和父类
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("本类及其父类所有的属性="+field.getName());
        }
        //
        Class<?>[] declaredClasses = aClass.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println("本类所有的属性"+declaredClass.getName());
        }
        Method[] declaredMethod = aClass.getDeclaredMethods();
        for (Method method : declaredMethod) {
            System.out.println("本类中所有的方法："+method.getName());
        }
        //构造苯类的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器："+constructor.getName());
        }

        //获取包名
        System.out.println(aClass.getPackage().getName());
        //获取父类名
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
        //获取接口信息
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> interf : interfaces) {
            System.out.println("接口信息="+interf);
        }
        //获取注解信息annotation
        //@Deprecated
        Annotation[] annotation = aClass.getAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println("注解信息"+annotation1);
        }
    }
}
interface IA{}
interface IB{}

class A{
    public String hobby;
    public void hi(){}
    public A(){

    }
}
@Deprecated
class Person extends A implements IA,IB{
    public String name;
    public int age;
    private double sal;
    private void say(){}
    public Person(){}
    public Person(String name, int age, double sal){
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    public void m1(){}
    public void m2(){}
}
