package IO.Serializable;
import java.io.*;
/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})

public class MyClass extends Object implements Serializable{

    // 类的成员和方法
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        try {
            FileOutputStream fileOut = new FileOutputStream("e:\\test.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            System.out.println("Object has been serialized");
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化
        try {
            FileInputStream fileIn = new FileInputStream("e:\\test.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyClass obj2 = (MyClass) in.readObject();
            System.out.println("Object has been deserialized");
            System.out.println(obj2.toString());
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}