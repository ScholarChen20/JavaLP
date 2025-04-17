package BasicGrammar;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Number {
    public static void main(String[] args) {
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
        for (double num : nums) {
            test(num);
        }
    }

    private static void test(double num) {
        /*
        ceil 表示向上取整，即取最接近的整数，如 1.4 向上取整为 2，-1.4 向上取整为 -1
        floor 表示向下取整，即取最接近的整数，如 1.4 向下取整为 1，-1.4 向下取整为 -2
        round 表示四舍五入，即取最接近的整数，如 1.4 四舍五入为 1，-1.4 四舍五入为 -1
         */
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}