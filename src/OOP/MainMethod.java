package OOP;

public class MainMethod {
    /*
    main方法，所有该方法的访问权限必须是public
     */
    public static void main(String[] args) {
       //执行main方法时不必创建对象
        System.out.println("Hello World");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
