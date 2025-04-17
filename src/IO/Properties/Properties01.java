package IO.Properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取配置文件信息
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while((line = bufferedReader.readLine())!=null){
            String[] split = line.split("=");
            //如果我要求指定的ip,相对来说有点麻烦
            // 引出properties类
            if("ip".equals(split[0])){
                System.out.println(split[0]+" 值是 "+split[1]);
            }
//            System.out.println(split[0]+" 值是 "+split[1]);
        }
        bufferedReader.close();


    }
}
