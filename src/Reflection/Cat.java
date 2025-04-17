package Reflection;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Cat {
    public String name = "Smith";
    public int age = 10;
    public void m1(){
        System.out.println("cat m1");
    }
    public void hi(){
        System.out.println("hi "+ name);
    }

    public void cry(){
        System.out.println("cry "+ name);
    }
}
