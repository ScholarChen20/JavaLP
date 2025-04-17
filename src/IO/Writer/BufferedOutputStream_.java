package IO.Writer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferedOutputStream_ {
    public static void main(String[] args) {
        // TODO: Implement BufferedOutputStream
        String path = "e:\\test.txt";
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(path,true));
            bos.write("Hello, world!".getBytes());
            bos.write("This is a test.".getBytes());
            bos.write(1010);
//            bos.flush();
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(bos!= null){
                try {
                    bos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
