package Object.poly;

import Object.poly.Dog;

public class Master {
    private  String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void feed(Dog dog,Bone bone){
        System.out.println("人 "+name+" gei"+dog.getName()+" 吃" + bone.getName());
    }

}
