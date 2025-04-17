package IO;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferedCopy {
    public static void main(String[] args) {
        String str = "e:\\test.txt";
        String dest = "e:\\Cwq\\test_copy.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            bufferedWriter = new BufferedWriter(new FileWriter(dest));
            String line = null;// 读取一行
            // 循环读取每一行
            //readline 只是读取一行，并不读取换行符，所以需要用readLine()和newLine()来实现换行
            while ((line = bufferedReader.readLine())!= null) {
                bufferedWriter.write(line);// 写入一行
                bufferedWriter.newLine();// 写入换行符
                System.out.println(line);
            }
            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader!= null) {
                    bufferedReader.close();
                }
                if (bufferedWriter!= null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
