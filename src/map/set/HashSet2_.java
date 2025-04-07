package map.set;

import java.util.HashSet;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class HashSet2_ {
    public static void main(String[] args) {

        /*
        1.hashset底层是HashMap，HashMap底层是数组＋红黑树
        2.添加元素时，会先找到hash值后转换为索引值
        3.找到node中该索引位置上是否铀元素，没有则插入，
        4.有的话调用equals比较，如果相同放弃加入，不同则加入到最后
         */
//        HashSet hashSet = new HashSet();
        Node[] node = new Node[17];
        Node jack = new Node(null,"jack");
        Node john = new Node(null,"john");
        node[2] = jack;
        jack.next = john;
        System.out.println(node);




    }
}
class Node{
    Object item;

    public Node(Node next, Object item) {
        this.next = next;
        this.item = item;
    }

    Node next;

}
