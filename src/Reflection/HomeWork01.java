package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj, "Hello World");
        //得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //因为getName是public，所以可以在调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("invoke值为= "+invoke);
    }
}
class PrivateTest{
    private String name = "hellokitty";
    public String getName() {
        return name;
    }

}
