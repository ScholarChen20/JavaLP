package thread;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class Thread_ {
    public static void main(String[] args) {
        thread1 thread = new thread1();
        thread.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println("主线程运行中"+i);
        }

    }

}
class thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程运行中"+i);
        };
    }
}
