package OOP;

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(Tool.sum(10,20));
    }
}
class Tool{
    //静态方法 ,可以直接调用类名.方法
    //非静态方法不行
    public static int sum(int a, int b){
        return a+b;
    }
}
