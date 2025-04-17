package Reflection;

import java.lang.reflect.Field;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("Reflection.Student");
        Object object = aClass.newInstance();
        System.out.println(object.getClass());

        Field age = aClass.getField("age");
        age.set(object, 20);
        System.out.println(object);
        System.out.println(age.get(object));

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);//爆破
        System.out.println(name.get(object));
        name.set(null, "John");
        System.out.println(name.get(object));//获取属性值
        System.out.println(name.get(null));//要求name是static



    }
}
class Student{
    public int age;
    public String name;
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
