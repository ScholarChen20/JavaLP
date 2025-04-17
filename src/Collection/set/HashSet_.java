package Collection.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class HashSet_ {
    public static void main(String[] args) {
        /*
        1.不能存放重复元素，可以添加一个null
        2.取出顺序不同于存入顺序，但是是固定的
         */
        HashSet hashSet = new HashSet();
        hashSet.add("smith");
        hashSet.add("jacl");
        hashSet.add("smith");
        hashSet.add("yaoyao");
        hashSet.add(null);

        //遍历
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(hashSet);

        System.out.println("===========增强for循环==========");
        for (Object object :hashSet) {
            System.out.println(object);
        }

    }
}

