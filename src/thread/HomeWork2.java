package thread;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWork2 {
    public static void main(String[] args) {
        T t = new T();
        Thread t1 = new Thread(t);
        t1.setName("线程T1");
        Thread t2 = new Thread(t);
        t2.setName("线程T2");
        t1.start();
        t2.start();
    }
}
class T implements Runnable {
    private boolean flag = true;
    private int count = 10000;

    @Override
    public  void run() {
        while (flag) {
            synchronized (this) {  //线程同步
                if(count<1000){
                    System.out.println("余额不足"+count);
                    break;
                }
                count-=1000;
                System.out.println(Thread.currentThread().getName()+"取了1000，当前余额为"+count);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
