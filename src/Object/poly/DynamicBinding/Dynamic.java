package Object.poly.DynamicBinding;

public class Dynamic {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); //4 0
        System.out.println(a.sum1()); //20


        // 40 -》30
        // 当调用对象方法时，该方法回合该对象的内存地址绑定
        // 当调用对象属性时，没有动态绑定机制，哪里申明那里使用
    }
}
