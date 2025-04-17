package IO.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        /*
         * BufferedReader 是 Java 5 引入的类，它是 Reader 的子类，功能是从 BufferedReader 中读取文本文件。
         * 它提供了缓冲功能，可以提高读取文件的效率。
         * 构造方法：
         * BufferedReader(Reader in)
         * 作用：创建一个 BufferedReader 对象，该对象从指定的 Reader 中读取文本。
         * 读取文件：
         * 1. 创建 BufferedReader 对象。
         * 2. 调用 BufferedReader 的 readLine() 方法，读取文件中的每一行。
         * 3. 调用 BufferedReader 的 close() 方法，关闭 BufferedReader 对象。
         * 异常处理：
         * 1. 如果创建 BufferedReader 对象或读取文件时出现异常，则抛出 RuntimeException 异常。
         * 2. 如果调用 BufferedReader 的 close() 方法时出现异常，则忽略该异常。
         */
        BufferedReader reader = null;
        String path  = "e:\\test.txt";
        try {
            reader = new BufferedReader(new FileReader(path));
            String line = null;// 定义变量保存每行内容
            while ((line = reader.readLine()) != null) {
                // 读取每行内容并输出
                System.out.println(line);
            }
            System.out.println("Read end.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
