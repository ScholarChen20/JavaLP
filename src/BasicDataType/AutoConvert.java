package BasicDataType;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class AutoConvert {
    /**
     * main方法
     * @param args
     */
    public static void main(String[] args){
        /*
         * 自动类型转换
         * 1. 基本数据类型之间的转换：自动类型转换只适用于相同类型之间的转换，不允许不同类型之间的转换。
         * 2. 表达式中出现的运算符决定了类型转换的规则。
         * 3. 表达式中出现的运算符决定了类型转换的优先级。
         * 4. 对于赋值运算符，右边的表达式的值将自动转换为左边的变量类型。
         * 5. 对于条件运算符，条件表达式的值将自动转换为布尔类型。
         * 6. 对于位运算符，位运算符的操作数将自动转换为整数类型。
         *    对于无符号右移运算符，无符号右移运算符的操作数将自动转换为整数类型。
         */
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
    }
}
