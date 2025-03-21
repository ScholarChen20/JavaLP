package Object.interface_;

public class Test{
    public static void main(String[] args) {
        System.out.println(Interface.a);  //10
        A aa = new A();
        System.out.println(aa.a);  //10
    }
}
class A implements Interface{

}