package map.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LinkHashSet_ {
    public static void main(String[] args) {
        /*
        LinkHashSet底层是LinkHashMap，数组＋双向链表
        1.添加顺序与取出顺序一致
         */
        Set set = new LinkedHashSet();
        set.add(1231);
        set.add(456);
        set.add("hsp");
        set.add("smith");
        System.out.println(set);
    }
}
