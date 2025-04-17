package IO;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        /*
        1.编写一个dog.properties2
        2.编写dog.class ,创建对象
        3.创建dog对象，序列化文件搭配dog.txt文件中
         */
        Properties properties = new Properties();
        String path = "src\\dog.properties";
        properties.load(new FileReader(path));

        String name = properties.get("name")+"";
        int age = Integer.parseInt(properties.get("age")+"");
        String color = properties.get("color")+"";

        Dog dog = new Dog(name,age,color);
        System.out.println("====dog=====");
        System.out.println(dog.toString());
        //实现序列化操作 存储数据和数据类型
        String filePath = "e:\\hello.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(dog);
        oos.close();



    }
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String path = "e:\\hello.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog dog  = (Dog)ois.readObject();
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
