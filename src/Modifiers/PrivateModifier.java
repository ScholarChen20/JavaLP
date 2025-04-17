package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class PrivateModifier {
    /*
     * Private modifier can be used to restrict access to a class member.
     * It can be used to hide the implementation details of a class from other classes.
     */
    private int num = 10;
    private int getNum() {
        return num;
    }
    private void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        /*
        Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。
        它可以防止其他类访问私有成员，从而保护类的封装性。
         */
        PrivateModifier pm = new PrivateModifier();
        System.out.println(pm.getNum());
        pm.setNum(20);
        System.out.println(pm.getNum());
    }
}
