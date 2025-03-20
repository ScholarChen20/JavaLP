package Object.poly;

public class Poly01 {
    public static void main(String[] args) {
        Dog dog = new Dog("小黄");
        Master master = new Master("I");
        Bone bone = new Bone("大棒骨");

        master.feed(dog,bone);
    }
}
