package Enum;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
enum Color
{
    RED, GREEN, BLUE;
}
public class EnumAbout {
    enum ColorEnum {
        RED, GREEN, BLUE;
    }
    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);

        //
        ColorEnum c2 = ColorEnum.RED;
        System.out.println(c2);

        // 遍历枚举值
        for(Color c : Color.values()){
            System.out.println(c);
        }
    }
    // 输出结果：
    // RED
    // RED
}
