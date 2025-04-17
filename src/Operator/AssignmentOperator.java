package Operator;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class AssignmentOperator {
    public static void main(String[] args) {
        /*
         * Assignment Operator
         *   =    : Assigns value of right operand to left operand
         *   +=   : Adds and assigns the value of right operand to left operand
         *   -=   : Subtracts and assigns the value of right operand to left operand
         *   *=   : Multiplies and assigns the value of right operand to left operand
         *   /=   : Divides and assigns the value of right operand to left operand
         *   %=   : Modulo and assigns the value of right operand to left operand
         *   <<=  : Shifts left and assigns the value of right operand to left operand
         *   >>=  : Shifts right and assigns the value of right operand to left operand
         *   &=   : Bitwise AND and assigns the value of right operand to left operand
         */
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}