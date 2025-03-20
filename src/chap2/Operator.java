package chap2;
import java.util.*;
/*
s运算符
 */
public class Operator {
    public static void main(String[] args) {
        // 算描运算符
        int n1 = 10;
        int n2 = n1 + 10;
        // %取模 a % b = a - a /b * b
        System.out.println(10 % 3); //1
        System.out.println(-10 % 3); //-1
        System.out.println(10 % -3); //1
        System.out.println(-10 % -3); //-1

        //relational operator
//        int a = 9;
//        int b = 10;
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//        System.out.println(a < b);
//        System.out.println(a > b);
//        System.out.println(a != b);
//        System.out.println(a == b);

        //LogicOperator
        //短路与&& 第一个为假时，第二个则无需判断。更高效
        int age = 10;
        System.out.println(age > 10 && age < 20);
        //逻辑与&  两个为真才为真，否则为假。第一个条件不符合第二条件还需要判断
        System.out.println(age > 10 & age < 20);


        //短路或 ||
        //逻辑或 |  只要一条件为真结果都为真

        //取反！操作（取非）   ~按伟取反

        //三元运算符
//        int aa = 10;
//        int bb = 20;
//        int num = aa > bb ? aa : bb +3 ;
//        System.out.println(num);

        //运算符优先级
        //1（）{} 2单目运算符 3算数运算符 4位移运算符 5比较运算符 6逻辑运算符 7三元运算符 8赋值运算符


        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = scanner.next();
//        int age1 = scanner.nextInt();
//        double savage =  scanner.nextDouble();


        // -3^2 按位异或（两位以为是0一位是1结果为1，否则为0） ~2 按位取反
    }
}
