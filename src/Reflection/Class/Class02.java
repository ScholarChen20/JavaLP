package Reflection.Class;

import java.lang.reflect.Field;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        String path  = "src.Reflection.Cat";
        Class<?> aClass = Class.forName("src.Reflection.Cat");
        System.out.println(aClass);
        System.out.println(aClass.getClass());
        System.out.println(aClass.getPackage().getName()); //获取包名
        System.out.println(aClass.getName()); //得到全类名
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getSuperclass());

        //通过反射类型获取属性
        Field[] fields = aClass.getFields();
        System.out.println(fields.length);
        for (Field field : fields) {
            System.out.println(field);
        }
        //
        Field smith = aClass.getField("smith");
        System.out.println(smith);
    }
}
