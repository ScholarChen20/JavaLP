package BasicDataType;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class parameterType {
    /*
     * 定义一个方法，用于交换两个整数变量的值
     * @param x 第一个整数变量
     * @param y 第二个整数变量
     */
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b); // 调用swap方法
        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

}
