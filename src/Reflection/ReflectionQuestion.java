package Reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Dog dog = new Dog();
        dog.m1();

        //
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String Methodpath = properties.getProperty("Method").toString();//hi
        String Classpath = properties.getProperty("filepath").toString();
        System.out.println("classpath="+Classpath);
        System.out.println("method="+Methodpath);

        //使用反射机制解决
        //1.加载类
        Class cls = Class.forName(Classpath);
        //2.得到你加载的类src.Reflection.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass());
        //3.得到你加载的类的方法对象
        Method method = cls.getMethod(Methodpath);
        //4.通过method 的调用方法：即通过方法对象来实现调用方法
        method.invoke(o);//传统方法 对象.方法() ,反射机制 方法.invoke(对象)    hi smith
        //只需要修改配置文件即可实现方法修改
    }
}
class Dog{
    String name;
    public void m1(){
        System.out.println("Dog m1");
    }
}