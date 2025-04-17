package Operator;

import org.junit.jupiter.api.Test;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LogicOperator {
    public static void main(String[] args) {
        /*
         * &&: AND
         * ||: OR
         * !: NOT
         */
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
    @Test
    public void logicOperator(){
        int a =5;
        boolean b = (a<5)&&(a++<10);
        System.out.println(b);
        System.out.println(a);
        //output: false 5
        //The first condition is false, so the second condition is not evaluated. The value of a is 5.
    }
}
