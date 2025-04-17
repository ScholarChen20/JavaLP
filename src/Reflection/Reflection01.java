package Reflection;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        m1();
        m2();
    }

    /**
     * @param
     */
    public static void m1(){
        NewCat cat = new NewCat();
        long stat = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.m1();
        }
        long end  = System.currentTimeMillis();
        System.out.println("时间："+(end - stat));
    }

    public static void m2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("src.Reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        ///在反射调用时，取消访问调查
        hi.setAccessible(true);
        long stat = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long  end  = System.currentTimeMillis();
        System.out.println("时间差："+(end - stat));
    }
}
class NewCat{
    String name;
    public void m1(){
        System.out.println("Dog m1");
    }
    public void hi(){
        System.out.println("hi "+name);
    }
}