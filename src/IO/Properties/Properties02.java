package IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //Properties的父类是哈希表，底层是HashTable
        //1.如果key存在，则替换，没有的话则创建
        Properties properties = new Properties();
//        properties.load(new FileReader("src\\mysql.properties"));
//        System.out.println("list ======  ");
//        properties.list(System.out);
        properties.setProperty("charser","utf-8");
        properties.setProperty("pwd","213124");
        properties.store(new FileOutputStream("src\\mysql.properties"),null);

        System.out.println("保存配置成功");

        //修改其中一个键值对，如果没有

    }
}
