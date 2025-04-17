package Generics;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class TypeParameters {
    /*
     * 泛型类可以有类型参数，类型参数在声明类时指定，并在类中使用。
     * 类型参数可以是类、接口、基本类型或通配符。
     * 类型参数可以有多个，用逗号分隔。
     * 类型参数可以有上界（extends）和下界（super），用于限制类型参数的范围。
     * 类型参数可以有多个约束，用&分隔。
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }
    //定义一个下界为Number方法
    public static <T extends Comparable<T>> T minimum(T x, T y, T z)
    {
        T min = x; // 假设x是初始最小值
        if ( y.compareTo( min ) < 0 ){
            min = y; //y 更小
        }
        if ( z.compareTo( min ) > 0 ){
            min = z;
        }
        return min; // 返回最小对象
    }
    public static void main( String args[] ){
        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );

        System.out.printf( "%d, %d 和 %d 中最小的数为 %d\n\n",
                3, 4, 5, minimum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最小的数为 %.1f\n\n",
                6.6, 8.8, 7.7, minimum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最小的数为 %s\n","pear",
                "apple", "orange", minimum( "pear", "apple", "orange" ) );
    }
}
