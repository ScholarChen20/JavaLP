package BasicDataType;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ForceConvert {
    /*
     * 强制类型转换
     * 强制类型转换是指将一种数据类型转换为另一种数据类型。
     * 强制类型转换的语法格式为：(数据类型)值。
     * 强制类型转换的作用是为了解决不同类型的数据之间的运算问题。
     * 强制类型转换的原则是尽量避免，因为它会导致程序的运行效率降低。
     * 强制类型转换的注意事项：
     * 1. 强制类型转换可能会导致数据丢失或精度损失。
     * 2. 强制类型转换可能会导致数据溢出。
     * 3. 强制类型转换可能会导致数据溢出或数据截断。
     * 4. 强制类型转换可能会导致数据精度丢失。
     */
    public static void main(String[] args){
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}
