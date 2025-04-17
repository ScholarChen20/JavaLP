package NetWork.Socket_;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class SocketServer {
    public static void main(String[] args) throws IOException {
        /*
        1.在本机9999端口监听事件
        2.没有客服端连接9999端口，程序会堵塞等待连接
        3，通过socket.getInputStream读取客户端写入的数据
         */
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接。。。。");

        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket"+socket.getClass());

        InputStream inputStream = socket.getInputStream();

        byte[] buffer = new byte[1024];
        int readlen =0 ;
        while ((readlen = inputStream.read(buffer)) != -1) {
            System.out.println(new String(buffer,0,readlen));//根据实际读取的长度显示内容
        }

        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("server 端已经关闭");

    }
}
