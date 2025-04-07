package map.list;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Vector;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class vector {
    public static void main(String[] args) {
        /*
        Vector 是一个对象数组，线程安全。但效率不高
        1.无参默认容量为10，满后两倍扩容。指定大小，直接2倍扩容
         */
        Vector vector = new Vector();
        /*
        add方法
        public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);   //确定是否需要扩容
        elementData[elementCount++] = e;
        return true;
    }
         */
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);

    }
}
