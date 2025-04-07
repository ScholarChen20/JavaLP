package String;

public class Test1 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());


        System.out.println(stringBuffer);
        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.length());   ///空指针异常

    }
}
