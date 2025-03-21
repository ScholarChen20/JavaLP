package Object.interface_;

public class ExtendsVSInterface {
    public static void main(String[] args) {
        LitterMonkey litterMonkey = new LitterMonkey("悟空");
        litterMonkey.eat();
        litterMonkey.sleep();
    }
}


interface animal{
    public void eat();
    public void sleep();
}

class Money{
    public String name;

    public Money(String name) {
        this.name = name;
    }
}

class LitterMonkey extends Money implements animal{
    public LitterMonkey(String name) {
        super(name);
    }
    @Override
    public void sleep() {
        System.out.println(name  + " flys the sea");
    }
    @Override
    public void eat() {
        System.out.println(name + "  eats the priple");
    }
}