package CommonDataList;

/**
 * @author chenwq
 * @apiNote dataList
 * @version 0.1
 */
public class dataList {
    public static void main(String[] args) {
        // 整数类型 byte1 short2 int4 long8  浮点型 float4 double8
        // 字符型 char2
        // 布尔型 boolean1
        // 引用数据类型 类，接口，数组

//        byte n1 = 10;  // -128~127
//        short n2 = 10;  // -2^15~2^15
//        int n3 = 111;  // 4个字节  -2^31~2^31
//        long n4 = 111L; // 8个字节  -2*63~2^63
//        System.out.println(n1+n2+n3+n4);
        String age = "2";
        int age1  = 10 + Integer.parseInt(age);
        System.out.println(age1);
        String name = "coco" + String.valueOf(age1);
//        System.out.println(name);
        // bit最小存储单元  byte基本存储单元

        float price = 1.22f;   //浮点数 = 符号位 + 指数位 +  尾数位
        double num2 = 2.12e-2;
        String total = "2.22" + Double.valueOf(num2);

        // 浮点数陷阱 2.7 和 8.1/3区别
        double n1 = 2.7;
        double n2 = 8.1/3;
        System.out.println(n1);
        System.out.println(n2); //接近于一个2.7的小数，对运算结果是小数进行相等判断是很危险
        if(n1 == n2){
           System.out.println("相等");
        }
        System.out.println(Math.abs(n1 - n2));


        //字符类型
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '含';
        char c4  = 92;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
