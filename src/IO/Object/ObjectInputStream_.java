package IO.Object;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ObjectInputStream_{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filepath = "e:\\data.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath));

//        obs.writeInt(100);
//        obs.writeFloat(1.1f);
//        obs.writeDouble(2.2);
//        obs.writeBoolean(Boolean.TRUE);
//        obs.writeObject(null);
//        obs.writeUTF("hsp教育");

        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readFloat());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readBoolean());
        Object dog = objectInputStream.readObject();
        System.out.println(dog.getClass());
        System.out.println(objectInputStream.readUTF());

        objectInputStream.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
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