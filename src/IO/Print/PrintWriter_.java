package IO.Print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        /*
        1.一定要包含close
        2.打印流只有输出流，没有输入流
         */
        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\hsp.txt"));
        printWriter.println("Hello World");
        printWriter.close();

    }
}
