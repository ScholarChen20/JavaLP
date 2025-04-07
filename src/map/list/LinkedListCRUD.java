package map.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.addFirst(4);

        System.out.println(linkedList);
        linkedList.remove();   //默认删除第一节点
        System.out.println(linkedList);

        System.out.println("======修改元素=======");
        linkedList.set(2,1000);
        System.out.println(linkedList);

        System.out.println("======获取节点=======");
        System.out.println(linkedList.get(2));
        Iterator iterator = linkedList.iterator();
        System.out.println("======迭代器遍历======");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=====for 增强======");
        for (Object object :linkedList) {
            System.out.println(object);
        }

    }
}
