package Collection.list;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LinkedList_ {
    public static void main(String[] args) {

        /*
        LinkedList底层实现了双向链表和双端队列的特点
        1。维护两个属性first和last，分别指向首节点和味节点
        2.添加和删除不是通过数组完成的，效率高
         */
//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst(1);
//        linkedList.addFirst(2);
//
//        linkedList.addFirst(null);
//        System.out.println(linkedList);

        Node node1 = new Node("jacl");
        Node node2 = new Node("mama");
        Node node3 = new Node("tom");

        node3.next = node2;
        node2.next  = node1;

        node1.prev = node2;
        node2.prev = node3;

        Node first  = node3;
        Node last  = node1;

        //遍历
        System.out.println("=====从头开始遍历=========");
        while(true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        Node smith = new Node("smith");
        smith.next = node1;
        smith.prev = node2;
        node2.next = smith;
        node1.prev = smith;

        System.out.println("=====从尾开始遍历======");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.prev;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node prev;
    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item
                +'}';
    }
}