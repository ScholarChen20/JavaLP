package IO.Print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
//        PrintStream printStream = new PrintStream(System.out);
        /*
        1.printStream 字节打印流
        2.默认打印输出为控制台，标准输出
        3.
         */

        String path = "e:\\hello.txt";
        PrintStream out = new PrintStream(new FileOutputStream(path));
//        out.write(100);
        out.println("Hello World");
        out.write("hsp教育".getBytes());
        out.close();

        System.setOut(out);//修改显示位置

    }
}
