package Object.abstract_;

public class abstract_ {
    public static void main(String[] args) {
        Dog jack = new Dog("jack");
        jack.eat();

    }
}
/*
1. 抽象类不能·被实例化,抽象方法不能有方法体
2. 抽象类可以没有抽象方法
3. 一旦定义抽象方法，就一定要定义为抽象类
4. 一个类继承抽象类的所有方法，它必须实现抽象类的所有抽象方法
 */
abstract class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("sleep");
    }
}
abstract class cat extends Animal{
    public cat(String name) {
        super(name);
    }
    public abstract void eat();
}

class Dog{
    public String name;
    public Dog(String name) {
        this.name = name;

    }
    public void eat(){
        System.out.println("eat");
    };
}