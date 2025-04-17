package IO.Object;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String SrcPath = "e:\\data.txt";
//        String destPath = "e:\\hsp.jpg";
        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(SrcPath));


        obs.writeInt(100);
        obs.writeFloat(1.1f);
        obs.writeDouble(2.2);
        obs.writeBoolean(Boolean.TRUE);
        obs.writeObject(new NewDog("smith",21));
        obs.writeUTF("hsp教育");

        obs.close();
        System.out.println("数据录入完成！~~~！！！！！！");
    }
}

class NewDog implements Serializable {
    private String name;
    private int age;

    public NewDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}