package IO.Reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferedInputStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO
        //BufferedInputStream类是InputStream的子类，BufferedInputStream类实现了缓冲功能，
        // 它可以提高输入流的读取速度。BufferedInputStream类构造函数需要一个InputStream对象作为参数，
        // 该参数表示要缓冲的输入流。BufferedInputStream类提供了一些方法，
        // 如read()方法可以从缓冲区中读取字节，available()方法可以获取缓冲区中可读取的字节数，
        // 以及其他一些方法。BufferedInputStream类提供了一些方法，
        // 如mark()方法可以标记当前位置，reset()方法可以回到标记的位置，
        // 以及其他一些方法。BufferedInputStream类提供了一些方法，
        // 如close()方法可以关闭缓冲流，flush()方法可以刷新缓冲区，
        // 以及其他一些方法。
        String path = "e:\\test.txt";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        int data = 0;
        byte[] buf = new byte[1024];
        try {
            System.out.println("====第一种方式读取====");
            while ((data = bis.read())!= -1) {
                System.out.print((char) data);
            }
            System.out.println("====第二种方式读取====");
            while ((data = bis.read(buf)) != -1) {
                System.out.println(new String(buf, 0, data));// 输出缓冲区中的内容
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
