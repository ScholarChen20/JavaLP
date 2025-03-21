package Final;

public class Final01 {
    public static void main(String[] args) {
        D d = new D();
//        d.sal = 2222.0;

    }
}
class A{
    public void f(){
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void f(){
        System.out.println("B");
    }
}

class C extends B{
    public final void sun(){
        System.out.println("C");
    }
}

class D extends C{
    /*
    final修饰的属性是静态的，初始化的位置只能时定义时，在静态代码块，不能在构造器中赋值
     */
    public final double sal1=2.9;
//    public final doubel sal3;
    public D() {
//        sal3 = 213.20;
    }

    public final double sal = 2000.0;

}
