package Thread;

import java.util.Scanner;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class HomeWord1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random()*100 + 1));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}


class B extends Thread {
    private A a = new A();
    private boolean loop = true;
    Scanner sc = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println("请输入你的指令Q值，否则一致循环");
            char key = sc.next().toUpperCase().charAt(0);
            if(key == 'Q'){
                a.setLoop(false);
                System.out.println("退出循环");
                break;
            }

        }
    }
}