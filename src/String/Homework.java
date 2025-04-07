package String;

import java.util.Scanner;

/**
 * @author ScholarChen20
 * @version 0.1
 */
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        countStr(str);

    }
    public static void countStr(String str) {
         if (str == null){
             System.out.println("null");
             return;
         }
         int strlen = str.length();
         int lower = 0;
         int upper = 0;
         int numcount = 0;
         int other  = 0;
         for (int i = 0; i < strlen; i++) {
             if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    upper++;
             }
             else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                 lower++;
             }
             else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                 numcount++;
             }
             else{
                 other++;
             }
         }
         System.out.println("小写"+lower);
        System.out.println("大写"+upper);
        System.out.println("数字"+numcount);
        System.out.println("其他"+other);
    }
}
