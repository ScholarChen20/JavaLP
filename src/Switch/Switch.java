package Switch;

import java.lang.Math;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       System.out.println("请输入一个字符a~g:");
       Scanner scanner = new Scanner(System.in);
       char ch = scanner.next().charAt(0);
       switch (ch){
           case 'a':
               System.out.println("a");break;
           case 'b':
               System.out.println("b");break;
           case 'c':
               System.out.println('c');break;
           default:
               System.out.println("你输入的字符串类型不对");
       }
       System.out.println((int)(Math.random()*100));
    }
}
