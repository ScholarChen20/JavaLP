package Collection.list;

import java.util.ArrayList;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        /*
        ArrayList 是线程不安全的 没有synchronized
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(4);
        System.out.println(arrayList);


    }
}
