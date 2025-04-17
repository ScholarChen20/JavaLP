package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassWildcard {
    public static void main(String[] args) {
        /*
        类型通配符的使用：
        1. 类型通配符的声明：?
        2. 类型通配符的使用：List<?> data = new ArrayList<Integer>();
        3. 类型通配符的作用：可以使得代码更加灵活，可以接收任何类型的集合对象。
         */
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}
