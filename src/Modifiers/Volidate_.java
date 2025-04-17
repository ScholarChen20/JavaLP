package Modifiers;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Volidate_ implements Runnable {
//    long  a = 0; // 非 volatile 变量
    /*
    volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。
    而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
     */
    private volatile boolean active;

    public void run() {
        active = true;
        while (active) // 第一行
        {
            // 代码
        }
    }

    public void stop() {
        active = false; // 第二行
    }

    public static void main(String[] args) {
        Volidate_ volidate = new Volidate_();
        Thread thread = new Thread(volidate);
        thread.start();// 开启线程
        // 等待一段时间，让线程运行一段时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*
        通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。
         如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
         */
        volidate.stop();// 停止线程
    }
}
