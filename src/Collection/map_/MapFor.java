package Collection.map_;

import java.util.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("宝马",231231);
        map.put("ss",123);
        map.put("heloo","sdas");
        map.put(null,null);
        System.out.println(map);

        map.remove(null);
        System.out.println("========第一此遍历=======");
        Collection coll = map.values();
        for (Object object : coll) {
            System.out.println(object);
        }

        System.out.println("=======第二次遍历=======");
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //通过entrymap遍历
        System.out.println("=======第三次遍历=======");
        Set entrymap = map.entrySet();
        for (Object object :entrymap) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("=======第四次========");
        Iterator iterator1 = entrymap.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
