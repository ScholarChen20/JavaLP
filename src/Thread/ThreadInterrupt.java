package Thread;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ThreadInterrupt extends Thread
{
    public void run()
    {
        try
        {
            sleep(50000);  // 延迟50秒
        }
        catch (InterruptedException e)// 捕获InterruptedException异常
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception
    {
        Thread thread = new ThreadInterrupt();
        thread.start();
        System.out.println("在50秒之内按任意键中断线程!");
        System.in.read();// 等待用户输入
        thread.interrupt();// 中断线程
        thread.join();// 等待线程退出
        System.out.println("线程已经退出!");
    }
}