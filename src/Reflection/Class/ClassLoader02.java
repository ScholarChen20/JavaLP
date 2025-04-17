package Reflection.Class;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ClassLoader02 {
    public static void main(String[] args) {
        /**
         * 类加载分为三个阶段，分为加载、连接和初始化
         * 1.加载：
         * 2.连接分为三个阶段，验证、准备和解析阶段。
         * 2.1 验证阶段确保Class文件的字节流中包含的信息符合当前虚拟机的要求，不会危害虚拟机自身的安全
         * 2.2 准备阶段会在该阶段堆静态变量分配内存并默认初始化（0,0L,null,false)
         * 2.3 解析阶段将常量池内的符号引用替换为直接引用的过程
         *
         * 3. 初始化阶段,保证内存中某个类在内存中只有一份class对象
         */
    }
}
class A{
    /**
     * 1. n1 实例属性，不是静态变量，准备阶段不会分配内存
     * 2，n2 静态变量，分配内存n2 的默认初始化0，而不是200
     * 3. n3 是static final 是常量，他和静态变量不一样，因为一旦赋值就不变 n3=300
     */
    public int n1 = 100;
    public static  int n2 = 200;
    public static final  int n3 = 300;
}
