package Collection.Iteation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class AugCollection {
    public static void main(String[] args) {

        Collection coll = new ArrayList();
        coll.add("adas");
        coll.add(123123);
        coll.add(true);

        for (Object o : coll) {
            System.out.println(o);
        }

        int[] nums = new int[10];
        //增强for ，底层也是迭代器原理。简化版本的迭代器
        for(int i: nums){
            System.out.println(i);
        }

    }
}
