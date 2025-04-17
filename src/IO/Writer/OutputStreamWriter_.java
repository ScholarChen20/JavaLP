package IO.Writer;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class OutputStreamWriter_ {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO: Implement OutputStreamWriter
        String srcpath = "e:\\test.txt";
        OutputStreamWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(srcpath));// 打开文件输出流
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(srcpath)));// 打开文件输出流

            bw.write("hsp教育!");// 写入内容
            bw.newLine();// 换行
            System.out.println("bw" +
                    "写入成功！");

            writer.write("hsp教育!");// 写入内容
            writer.flush();// 刷新缓冲区
            // 换行
            writer.write("\r\n");
            writer.write("你好，世界！");
            writer.flush();
            System.out.println("写入成功！");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    }
            }
        }
    }
}
