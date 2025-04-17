package IO.Serializable;
import java.io.*;
/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class DeserializeDemo {
    public static void main(String [] args)
    {
        Employee e = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("e:\\hello.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);// 反序列化
            e = (Employee) in.readObject();// 读取对象
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
