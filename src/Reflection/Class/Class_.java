package Reflection.Class;


/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /**
         * 1.CLass是又系统生成的,也是类，继承Object
         * 2.对于某个人类的Class对象，在内存中只有一份，因为类只加载了一次
         * 3.Class对象存放在堆上
         */
//        Cat cat = new Cat();
        Class aClass = Class.forName("src.Reflection.Cat");

//        Class<?> aClass = Class.forName("src.Reflection.Cat");
//        aClass.newInstance();
        System.out.println(aClass.hashCode());
        Class aClass1 = Class.forName("src.Reflection.Cat");
        System.out.println(aClass1.hashCode());


    }
}

