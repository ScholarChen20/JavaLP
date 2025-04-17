package Reflection.Class;

import javax.smartcardio.Card;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
         //1，通过提示Class.forName
        String classPath = "src.Reflection.Class";
        Class<?> aClass = Class.forName(classPath);
        System.out.println(aClass);

        //2.类名.class 用于参数传递
        Class cls = Cat.class;
        System.out.println(cls);

        //3. 对象,getClass()  用于又对象实例
        Cat cat = new Cat();
        Class aClass1 = cat.getClass();
        System.out.println(aClass1);

        //4.通过类加载器获取Class对象
        //得到类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("Reflection.Class");
        System.out.println(aClass2);
        //基本数据类型也可获的
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println(integerClass);
        System.out.println(characterClass);
        //.TYPE 得到类对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());//两个值为相等，自动装箱和拆箱过程

    }
}
