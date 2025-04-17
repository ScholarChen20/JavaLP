package IO.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class SerializeDemo {
    public static void main(String [] args)
            /*
            当你序列化对象时，你把它包装成一个特殊文件，可以保存、传输或存储。反序列化则是打开这个文件，读取序列化的数据，然后将其还原为对象，以便在程序中使用。
            Java 序列化是一种将对象转换为字节流的过程，以便可以将对象保存到磁盘上，将其传输到网络上，或者将其存储在内存中，以后再进行反序列化，将字节流重新转换为对象。
            序列化的过程是将对象转换为字节流，而反序列化的过程则是将字节流转换为对象。
            序列化的目的是为了将对象保存到磁盘上，以便在需要时可以恢复，而反序列化的目的是为了将字节流转换为对象，以便在程序中使用。
            序列化的实现需要实现 java.io.Serializable 接口，该接口是一个空接口，没有方法，但它确保了该类可以被序列化。
            序列化的过程是通过 ObjectOutputStream 类来实现的，该类实现了 java.io.ObjectOutput 接口，该接口定义了输出对象的方法。

             */
    {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("e:\\hello.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);// serialize the object
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in e:\\hello.txt");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

}

