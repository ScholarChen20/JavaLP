package thread;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class DeadLock {
    public static void main(String[] args) {
        DeadLockThread lock1 = new DeadLockThread(true);
        lock1.setName("死锁1");
        DeadLockThread lock2 = new DeadLockThread(false);
        lock2.setName("死锁2");
        lock1.start();
        lock2.start();
    }
}
class DeadLockThread extends Thread {
    Object lock1 = new Object();
    Object lock2 = new Object();
    boolean flag = true;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run() {
        if(flag) {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }
        else{
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }

}