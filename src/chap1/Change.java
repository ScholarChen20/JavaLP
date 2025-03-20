package chap1;

/**
 * @author chenwq
 * @version 0.1
 */
public class Change {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");

        // for (int i =1; i <= 5; i++) {System.out.println("i = " + i);
        System.out.println("北京\t天津\t上海");
        System.out.println("hello\n");
        //  :一个/ 需要使用 //
        //  \" :一个”
//        System.out.println("C:\\\\Window\\\\system32");
//        System.out.println("xxx说:\'hello\'");
        System.out.println("黑马成功的\r我会");
        //  \r 表示回车
        dog dog1=new dog();
        System.out.println(dog1.name);
        /*
        多行注释
         */
        //单行注释
    }
}
class dog{
  int numid;
  double score;
  String name;
  char sex;
  int age;
}
//    ..\ 表示上一级目录   相对路径需要使用