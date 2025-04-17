package Reflection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflectionUtils01 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         *
         */
//        Class<?> aClass = Class.forName("Reflection.Person");
//        System.out.println(aClass.getName());//获取全类名
//        System.out.println(aClass.getSimpleName());//获取简单类名
//        //获取所有public修饰的属性，包含本类和父类
//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println("本类及其父类所有的属性="+field.getName());
//        }
//        //
//        Class<?>[] declaredClasses = aClass.getDeclaredClasses();
//        for (Class<?> declaredClass : declaredClasses) {
//            System.out.println("本类所有的属性"+declaredClass.getName());
//        }
//        Method[] declaredMethod = aClass.getDeclaredMethods();
//        for (Method method : declaredMethod) {
//            System.out.println("本类中所有的方法："+method.getName());
//        }
//        //构造苯类的构造器
//        Constructor<?>[] constructors = aClass.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println("本类的构造器："+constructor.getName());
//        }
//
//        //获取包名
//        System.out.println(aClass.getPackage().getName());
//        //获取父类名
//        Class<?> superclass = aClass.getSuperclass();
//        System.out.println(superclass);
//        //获取接口信息
//        Class<?>[] interfaces = aClass.getInterfaces();
//        for (Class<?> interf : interfaces) {
//            System.out.println("接口信息="+interf);
//        }
//        //获取注解信息annotation
//        //@Deprecated
//        Annotation[] annotation = aClass.getAnnotations();
//        for (Annotation annotation1 : annotation) {
//            System.out.println("注解信息"+annotation1);
//        }
    }
    @Test
    public void api_02() throws ClassNotFoundException {
        /**
         * 1。默认修饰符为0，public是1，private为2，protected为4，static为8，final为16
         */
        Class<?> aClass = Class.forName("Reflection.Persons");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中的所有属性"+declaredField.getName()
                    +" 该属性的修饰符值"+declaredField.getModifiers()
                    +" 该属性的类型"+declaredField.getType());
        }

        Method[] methods = aClass.getDeclaredMethods();
        for (Method declaredMethod : methods) {
            System.out.println("本类中所有的方法"+declaredMethod.getName()
                    +" 该方法的访问的修饰符值"+declaredMethod.getModifiers()
                    +" 该方法返回的类型"+declaredMethod.getReturnType());
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型："+parameterType);
            }
        }
        Constructor[] constructors = aClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : constructors) {
            System.out.println("本类中所有构造器 = "+declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型："+parameterType);
            }
        }

    }
}
interface IAA{}
interface IBB{}

class AA{
    public String hobby;
    public void hi(){}
    public AA(){

    }
}
@Deprecated
class Persons extends AA implements IAA,IBB{
    public String name; //1
    public static int age;   //8+1
    private double sal; //2
    private void say(){}
    public Persons(){}
    public Persons(String name, int age, double sal){
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    public void m1(String name,int age,double sal){

    }
    public void m2(){}
    void m3(){}
    protected void m4(){}

}
