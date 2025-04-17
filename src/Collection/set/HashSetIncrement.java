package Collection.set;

import java.util.HashSet;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i <=12; i++) {
            hashSet.add(new A(i));
        }
    }
}

class A{
    private int a;
    public A(int a){
        this.a = a;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}