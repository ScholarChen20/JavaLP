package Operator;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class RelationOpearate {
    public static void main(String[] args) {
        // Relation Operators
        /*
         * == : equal to
         * != : not equal to
         *  > : greater than
         *  < : less than
         * >= : greater than or equal to
         * <= : less than or equal to
         */
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
}
