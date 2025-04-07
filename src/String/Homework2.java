package String;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Homework2 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = "hello";
        System.out.println(s1 == s2);  //false
        System.out.println(s1.equals(s2)); //false


        String s3 = "helloworld";
        String s4 = s2 + "world";
        System.out.println(s3 == s4);  //false
        System.out.println(s4.intern() == s3);  //true
        //intern 最终是指向堆的常量池地址
    }
}
