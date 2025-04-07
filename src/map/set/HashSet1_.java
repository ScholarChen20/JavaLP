package map.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class HashSet1_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(new Integer(1));
        hashSet.add(new Integer(2));
        hashSet.add(new Integer(3));
        hashSet.add(new Integer(4));
        System.out.println(hashSet);

        hashSet.remove(new Integer(1));
        System.out.println(hashSet);

        HashSet set = new HashSet();
        set.addAll(hashSet);
        System.out.println(set);

        set.clear();
        set.add(new Dog("yellow"));
        set.add(new Dog("green"));
        set.add(new Dog("yellow"));//可以加入
        System.out.println(set);

        set.add(new String("yaoyao"));
        set.add(new String("yaoyao"));//加入不了，重复
        System.out.println(set);


    }
}
class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
}