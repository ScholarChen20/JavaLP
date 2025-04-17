package BasicDataType.VariableType_;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class VariableType {
    // 成员变量
    private int instanceVar;
    // 静态变量
    private static int staticVar;

    public void method(int paramVar) {
        // 局部变量
        int localVar = 10;

        // 使用变量
        instanceVar = localVar;
        staticVar = paramVar;

        System.out.println("成员变量: " + instanceVar);
        System.out.println("静态变量: " + staticVar);
        System.out.println("参数变量: " + paramVar);
        System.out.println("局部变量: " + localVar);
    }

    public static void main(String[] args) {
        VariableType v = new VariableType();
        v.method(20);
    }
}
