package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class FileCopy {
    public static void main(String[] args) {
        String src = "e:\\test.png";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream("e:\\Cwq\\test_copy.png");
            byte[] b = new byte[1024];// 1KB
            int len;// 读取的字节数
            while ((len = fis.read(b))!= -1) {
                fos.write(b, 0, len);// 写入的字节数
            }
            System.out.println("文件拷贝成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fis!= null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos!= null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
