package SmallChanageSys;

//import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author chenwq
 * @version 0.1
 */
public class samllChanageSystem {
    public static void main(String[] args) {
        boolean loop = true;

        //2. 完成零钱通明细
        String details = "=============零钱通菜单=================";

        //3. 完成收益入账
        double money = 0.;
        double balance = 0.0;
        Date date = null;

        //4. 消费
        String note = "";


        do {
            System.out.println("\n=============零钱通菜单=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            Scanner scanner = new Scanner(System.in);
            String key = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            System.out.println("请选择（1-4）:");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    balance = balance + money;
                    details += "\n收益入账\t" + money  + "\t" + dateFormat.format(new Date()) +"\t"+  balance;
                    System.out.println("添加成功，前往明细中查看");
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    balance = balance - money;
                    System.out.println("消费说明:");
                    note = scanner.next();
                    details += "\n"+ note +"\t"+money +"\t" + dateFormat.format(new Date()) +"\t"+  balance;
                    System.out.println("消费成功，前往明细中查看");
                    break;
                case "4":
                    System.out.println("4 退出");

                    loop = false;
                    break;
                default:
                    System.out.println("选择有误，重新选择");
            }

        } while (loop);
        System.out.println("退出系统成功");

    }

//    public void
}


