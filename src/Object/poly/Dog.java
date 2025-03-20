package Object.poly;

import Object.poly.Animal;

public class Dog extends Animal {
    public void cry(){
        System.out.println(" dog cry");
    }

    public void eat(){
        System.out.println(" dog eat");
    }

    public String m1(){
        return null;
    }

    //子类方法不能缩小父类方法的访问权限
    //public -> protected ->默认 -> private

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
