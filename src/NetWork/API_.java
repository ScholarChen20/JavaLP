package NetWork;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        /*
        1.演示INet
         */
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());

        //根据指定主机名获取ip地址
        InetAddress ip2 = InetAddress.getByName("DESKTOP-SKM040F");
        System.out.println("主机名对应ip"+ip2);

        //
        InetAddress ip3 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2="+ip3);

        //
        String ipadddress = ip.getHostAddress();
        System.out.println(ipadddress);

        //.获取主机名或域名
        String hostname = ip.getHostName();
        System.out.println("ip地址对应的主机名"+hostname);
    }
}
