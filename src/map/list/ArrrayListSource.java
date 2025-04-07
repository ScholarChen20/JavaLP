package map.list;

import java.util.ArrayList;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ArrrayListSource {
    public static void main(String[] args) {
        /*
        1.arraylist维护了一个Object的数组elementData
        2.无参构造器初始化容量为0，第一次添加扩容为10，如需要再次扩容则为element的1，5呗
        3.如果使用了指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容
         */
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i < 15 ; i++) {
            arrayList.add(i);
        }
        arrayList.add(200);
        arrayList.add(1300);
        System.out.println(arrayList);



    }
}
