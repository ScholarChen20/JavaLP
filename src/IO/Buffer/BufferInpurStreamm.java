package IO.Buffer;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferInpurStreamm {
    public static void main(String[] args) throws IOException {
        String SrcPath = "e:\\Kaola.jpg";
        String destPath = "e:\\hsp.jpg";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;


        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(SrcPath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));

            byte[] buffer = new byte[1024];
            int length =0 ;
            while(( length = bufferedInputStream.read(buffer))!= -1){
                bufferedOutputStream.write(buffer,0,length);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

            if (bufferedInputStream != null) {

                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        }


    }
}
