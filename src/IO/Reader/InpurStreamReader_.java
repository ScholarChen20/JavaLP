package IO.Reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class InpurStreamReader_ {
    public static void main(String[] args) {
        /*
        * InputStreamReader是InputStream的子类，用于将字节流转换为字符流。
        * InputStreamReader的构造函数需要一个InputStream对象和字符集编码，
        * 然后就可以使用read()方法读取字符。
        * 读取完毕后，需要关闭InputStreamReader。
         */
        String path = "e:\\test.txt";
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(path), "UTF-8");// 字符集编码为UTF-8
            char[] buffer = new char[1024];
            int len = 0;
            while ((len = reader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
                // do something with the data
            }
            System.out.println("End of file");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
