package String;

import java.util.Scanner;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = "1234564.78";
        StringBuffer stringBuffer = new StringBuffer(price);
        int i = stringBuffer.indexOf(".");

//        stringBuffer.insert(i-3,",");
        for (int j = stringBuffer.indexOf("."); j >0 ; j-=3) {
            stringBuffer = stringBuffer.insert(j,",");
        }
        System.out.println(stringBuffer);



    }
}

