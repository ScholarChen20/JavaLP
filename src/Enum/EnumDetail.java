package Enum;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
enum ColorEnum{
    Red,
    Green,
    Blue,
    Yellow
}
public class EnumDetail {
    /*
    values() 返回枚举类中所有的值。
    ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
    valueOf()方法返回指定字符串值的枚举常量。
     */
    public static void main(String[] args)
    {
        // 调用 values()
        Color[] arr = Color.values();

        // 迭代枚举
        for (Color col : arr)
        {
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }

        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
