package IO.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FileWriter_ {
    public static void main(String[] args) {
        String fileName = "e:\\test.txt";
        FileWriter fw = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fw = new FileWriter(fileName    );
            fw.write("Hello, world!");
            fw.write('d');
            fw.write(chars);
            fw.write(String.valueOf(true));
            fw.write(new char[]{'a', 'b', 'c'});
            fw.write("how are you?",0,10);
            fw.write("hsp教育".toCharArray(),0,4);
            System.out.println("Write successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
