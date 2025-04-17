package Collection.collection;

import java.util.ArrayList;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class collection {
    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<String, Integer>();
//        map.put("a", 1);
//        map.put("b", 2);
//        map.put("c", 3);
//
//        System.out.println(map.get("a"));

        /*
        1.集合分为两组，单列集合，双列集合
        2.collection 接口有两个重要的接口，List和Set
        List   ->ArrayList、LinkedList、vector
        Set    -> HashSet、TreeSet
         */

        ArrayList<String> strings = new ArrayList<>();
        strings.add("adsada");
        strings.add("hello");
        strings.add("world");
        System.out.println(strings);
        strings.remove(1);
        System.out.println(strings);

        ArrayList arrayList = new ArrayList();
        arrayList.add("adsada");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add(12323);
        System.out.println(arrayList);
        boolean isno = arrayList.contains("adsada");
        System.out.println(isno);
        arrayList.addAll(strings);
        System.out.println(arrayList);


        arrayList.clear();
        System.out.println(arrayList);
    }
}
