package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflecAccessMethod {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException {
        Class<?> aClass = Class.forName("Reflection.Boss");
        Object object = aClass.newInstance();
        Method hi = aClass.getDeclaredMethod("hi", String.class);
        hi.invoke(object,"john");

        Method declaredMethod = aClass.getDeclaredMethod("say", int.class, String.class, char.class);
        declaredMethod.setAccessible(true);
        System.out.println(declaredMethod.invoke(object,10,"smith",'c'));
        //因为say方法时static的，还可以这样调用，可以直接传入null

        Object  o = declaredMethod.invoke(null,30,"hsp",'男');
        System.out.println("o 的运行类型是"+o.getClass());
        //在反射中，如果方法又返回值，统一返回object，但是他的运行类型和方法定义的返回类型一致

    }
}

class Boss{
    public int age;
    private  static String name;
    public Boss(){}

    private static String say(int n,String s,char c){
        return n+" "+s+" "+c;
    }

    public void hi(String s){
        System.out.println("hi "+s);
    }
}
