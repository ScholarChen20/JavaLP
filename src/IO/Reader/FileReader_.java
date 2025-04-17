package IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FileReader_ {
    public static void main(String[] args) throws IOException {
        String src = "e:\\hello.txt";
        FileReader reader = null;
        //第一种方式：使用try-with-resources语句
        try {
            System.out.println("======第一种方案======");
            reader = new FileReader(src);
            int c;// 读取字符
            char data = ' ';// 字符数组
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();

            System.out.println("======第二种方案======");
            //第二种方式：手动关闭资源
            reader = new FileReader(src);
            //使用字符数组
            char[] buffer = new char[1024];
            int len = 0;
            while ((len = reader.read(buffer)) != -1) {
                //如果返回-1，说明已经到达文件末尾
                System.out.println(new String(buffer, 0, len));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
