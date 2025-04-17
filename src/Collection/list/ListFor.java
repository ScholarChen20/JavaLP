package Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class ListFor {
    public static void main(String[] args) {
        /*
        list 的遍历方式
         */
        List list = new ArrayList();
        list.add("a");
        list.add("Dack");
        list.add("鱼香肉丝");
        System.out.println("========第一次=========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=========第二次========");
        for (Object object :list) {
            System.out.println(object);
        }
        System.out.println("==========第三次=========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
