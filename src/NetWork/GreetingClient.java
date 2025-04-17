package NetWork;
import java.net.*;
import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})

public class GreetingClient
{
    public static void main(String [] args)
    {
        String serverName = "172.31.71.162";
        int port = Integer.parseInt("7890");
        try
        {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}