package OOP;

public class ChildGame {
    public static void main(String[] args) {
        Child child = new Child("白骨精");
        Child child1 = new Child("牛马精");
        Child child2 = new Child("蜘蛛精");

        child.count();
        child1.count();
        child2.count();

        child.count++;
        child1.count++;
        child2.count++;

        System.out.println(child.count);
        System.out.println(child1.count);
        System.out.println(child2.count);
    }
}


class Child{
    public String name;
    //类变量
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Child.count = count;
    }

    public void count(){
        System.out.println(name+"join了游戏");;

    }
}