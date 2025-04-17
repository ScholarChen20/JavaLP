package BasicDataType.VariableType_;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LocalVariable {
    /*
     * 局部变量的声明和初始化
     * 局部变量的作用域：在方法、构造方法、代码块中声明的变量，只在该范围内有效。
     * 局部变量的生命周期：从声明开始，直到执行到离开该作用域为止。
     * 局部变量的声明和初始化：声明时，系统为变量分配内存空间，并初始化为默认值（0、false、null等）。
     */
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        LocalVariable test = new LocalVariable();
        test.pupAge();
    }
}
