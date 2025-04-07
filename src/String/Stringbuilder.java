package String;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Stringbuilder {
    public static void main(String[] args) {
        //stringbuilder 不是线程安全的，适用于单线程。速度块

        String str  = "hello";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse(); //翻转
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append("world");
        System.out.println(stringBuilder);

        int i  = stringBuilder.indexOf("o");

        System.out.println(i);
        long time1 ;
        long time2 ;

        time1  = System.currentTimeMillis();
        for (int j = 0; j < 20000; j++) {
            stringBuilder.append(String.valueOf(j));
        }
        time2  = System.currentTimeMillis();
        System.out.println("Stringbuilder "+(time2 - time1));

        time1  = System.currentTimeMillis();
        for (int j = 0; j < 20000; j++) {
            stringBuffer.append(String.valueOf(j));
        }
        time2  = System.currentTimeMillis();
        System.out.println("Stringbuffer "+(time2 - time1));

    }
}
