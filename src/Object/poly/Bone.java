package Object.poly;

public class Bone extends Food{

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bone(String name) {
        this.name = name;
    }
}
