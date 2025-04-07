package String;

public class Stringbuffer {
    public static void main(String[] args) {
        String name = "hello world";
        System.out.println(name);
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer);

        StringBuffer hello = new StringBuffer("hello");
        System.out.println(hello.equals(stringBuffer));  //false

        String s = hello.toString();
        System.out.println(s);
        //使用构造器
        String s1 = new String(hello);
        System.out.println(s1);

    }
}
