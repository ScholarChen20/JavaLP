package Thread;

import java.io.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class SleepingThread extends Thread {
    /*
    演示线程如何挂起
     */
    private int countDown = 5;
    private static int threadCount = 0;
    public SleepingThread() {
        super("" + ++threadCount);
        start();
    }
    public String toString() {
        return "#" + getName() + ": " + countDown;
    }
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0)
                return;
            try {
                sleep(100);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args)
            throws InterruptedException {
        for (int i = 0; i < 5; i++)
            new SleepingThread().join();
        System.out.println("线程已被挂起");
    }
}