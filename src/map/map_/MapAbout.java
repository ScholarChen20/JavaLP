package map.map_;

import java.util.HashMap;
import java.util.Map;
/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class MapAbout {
    public static void main(String[] args) {
       /*
       map与collection并列存在，用于保存具有映射关系的键值对
       1.map中的key不重复，原因和hashset一样。有相同的k等价于替换
       2.value可以重复
       3.key可以为空，但只有一个key可以为空，value可以多个为空
        */
        Map map2 = new HashMap();
        HashMap map = new HashMap();
        map.put("sadds",1);
        map.put("sadds",2);
        map.put("sadds",3);
        map.put("sadds",4);
        map.put(null,null);
        map.put("smith",null);
        System.out.println(map);
        map2.put("ddddd",1);
        System.out.println(map2);
    }
}
