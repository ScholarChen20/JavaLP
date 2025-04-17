package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        /*
        1.判断文件夹是否存在，不存在则创建
        2.判断是否有hello.txt文件，不存在则创建
        3，写入hello至文本文件中
         */
        String path = "e:\\hello";
        File file = new File(path);
        if(!file.exists()){
            if(file.mkdirs()){
                System.out.println("成功");
            }
            else{
                System.out.println("失败");
            }
        }
        String filepath = path + "\\hello.txt";
        file = new File(filepath);
        if(!file.exists()){
            if(file.createNewFile()){
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
                bufferedWriter.write("hello");
                bufferedWriter.close();
                System.out.println("创建成功");
            }
            else{
                System.out.println("创建失败");
            }
        }else{
            System.out.println("已经创建，请勿重复操纵");
        }



    }
}
