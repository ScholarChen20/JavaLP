package IO.Writer;

import java.io.BufferedWriter;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class BufferedWriter_ {
    public static void main(String[] args) {
        // TODO: Implement BufferedWriter_
        String path = "e:\\test.txt";
        BufferedWriter bw = null;
        char[] chars = {'a','b','c','d','e','f'};
        try {
            bw = new BufferedWriter(new java.io.FileWriter(path,true));// create a new BufferedWriter
            bw.write("Hello, world!");// write to file
            bw.write(chars);// write char array to file

            bw.newLine();
            bw.write("This is a test.");


            System.out.println("File written successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw!= null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
