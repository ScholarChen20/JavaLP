package IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Detail_ {
    public static void main(String[] args) throws IOException {
        //使用properties类读取properties文件

        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        System.out.println("list ======  ");
        properties.list(System.out);
        //获取单独信息
        String User = properties.getProperty("User");
        String Password = properties.getProperty("Password");
        String IP = properties.getProperty("IP");

        //修改或者添加信息

    }
}
