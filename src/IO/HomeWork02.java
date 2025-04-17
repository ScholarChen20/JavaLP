package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        /*
        1.使用bufferedReader读取一个文本文件，在每行加一个行号
         */
        String path = "e:\\hello.txt";
        BufferedReader br = null;
        String line = "";
        int lineNumber = 0;
        try {
            br  = new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null){
                System.out.println(++lineNumber+line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                br.close();
            }
        }

    }
}
