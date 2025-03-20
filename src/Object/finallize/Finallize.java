package Object.finallize;


/**
 * @version 0.1
 * @author chenwq
 */
//对象被回收时,会调用finalize函数
public class Finallize {
    public static void main(String[] args) {
        Car car = new Car("BM");
        car = null; // 垃圾回收期就会销毁这个对象
        //可以在finalize中，写自己的业务逻辑代码，比如释放资源、数据库连接
        System.gc();
        System.out.println("程序推出了");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize "+name);
        System.out.println("释放了汽车对象资源");

    }

}
