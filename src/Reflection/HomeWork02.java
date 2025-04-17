package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         *1.利用CLass类的forName方法得到File类的class对象
         *2。在控制台打印File类的所有构造器
         *3，通过newInstance的方法创建File对象，并创建E:\\hello.txt
         */
        //1.利用class类的得到File类的class对象
        Class<?> aClass = Class.forName("java.io.File");
        //2.得到构造器
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println("File构造器=" + constructor);
        }
        //3.指定的到public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor((String.class));
        String filePath = "e:\\hello.txt";
        Object object = declaredConstructor.newInstance(filePath);

        //4.得到createNewFile这个方法的对象,才是真正得创建文件
        Method declaredMethod = aClass.getMethod("createNewFile");
        declaredMethod.invoke(object);

        System.out.println(object.getClass());
        System.out.println("文件创建成功"+filePath);


    }
}

