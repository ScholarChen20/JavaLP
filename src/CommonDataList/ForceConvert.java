package CommonDataList;

public class ForceConvert {
    public static void main(String[] args) {
        int n1 = 10;
        byte n2 =10;
        System.out.println(n2);
        double n3  = n1 + n2 + 1.1;
        System.out.println(n3);

        // char类型只能保存int的常量值。不保存int的变量值
        int m = 100;
        char mm = (char)m;
        System.out.println(mm);

        //byte 和 short 在运行时转换为int类型计算

        // short s = 12; s = s -9 错误
        //byte b = 10; b = b + 11 错误



        /*
        基本数据类型转换为String类型
         */

        int n11 = 100 ;
        String s1 = n11 + "";
        System.out.println(s1);

        // 字符喘转换为基本数据类型
        String s2 = "1000";
        int num1 = Integer.parseInt(s2);
        System.out.println(num1);

        //怎么将字符串转成字符
        System.out.println(s2.charAt(0));
    }
}
