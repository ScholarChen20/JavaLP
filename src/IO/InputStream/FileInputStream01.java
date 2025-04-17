package IO.InputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FileInputStream01 {
    public static void main(String[] args) throws IOException {
        int readline = 0;
        FileInputStream f = null;
        try {
            f = new FileInputStream("e:\\hello.txt");
            if ((readline = f.read()) != -1) {
                System.out.println(readline);// 输出：101

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭流
            f.close();
        }
    }
    @Test
    public void test() {
        /*
         * 读取文件内容
         * 读取文件内容，每次读取1024字节
         * 读取完毕后关闭流
         * 异常处理
         * 注意：
         * 1. 读取文件内容时，每次读取的字节数最好不要超过1024字节，否则会导致内存溢出。
         * 2. 读取完毕后，需要关闭流，否则可能导致文件无法删除或占用资源。
         *    关闭流的方法：f.close()
         */
        String path = "e:\\hello.txt";
        FileInputStream f = null;
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            f = new FileInputStream(path);
            while ((len = f.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
