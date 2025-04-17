package NetWork.Socket_;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class SocketClient {
    public static void main(String[] args) throws IOException {
        /*
        1.连接服务端
        2.连接上后生成Socket，通过outputStream获取输出流对象
        3.通过输出刘，写入数据
         */
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 返回"+socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());

        outputStream.close();

        socket.close();
        System.out.println("客户端结束操作");


    }
}
