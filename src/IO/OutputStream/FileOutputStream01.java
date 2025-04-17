package IO.OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream("e:\\hello.txt",true);// append to file
            fileInputStream = new FileInputStream("e:\\hello.txt");
            fileOutputStream.write("Hello World!".getBytes());// write bytes to file
            System.out.println("File written successfully!");

            //
            fileOutputStream.write("\nThis is a new append line!".getBytes());
            System.out.println("Second line written successfully!");

            fileOutputStream.write("\nthe append third line!".getBytes(),0,10);
            System.out.println("Third line written successfully!");

            // read bytes from file
            System.out.println("Reading file contents");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) > 0) {
                System.out.println(new String(buffer, 0, len));
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            fileOutputStream.close();
            fileInputStream.close();
        }
    }
}
