package Collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class List_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for (Object object :arrayList) {
            System.out.println(object);
        }

        List list = new ArrayList();
        list.add(1);
        list.add("张三丰");
        list.add(1,"hsp");
        System.out.println(list);

        list.addAll(arrayList);
        System.out.println(list);
        list.add("hsp");
        System.out.println(list.get(1));

        System.out.println(list.indexOf("hsp"));
        System.out.println(list.lastIndexOf("hsp"));

        list.remove(1);
        System.out.println(list);

        list.set(0,"hsp");
        System.out.println(list);

        List ls = list.subList(0,2);
        System.out.println(ls);
    }
}
