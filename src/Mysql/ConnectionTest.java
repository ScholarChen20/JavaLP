package Mysql;
import java.sql.*;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class ConnectionTest {
    /*
    创建mysql数据库连接
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");// 加载mysql驱动
            // 数据库连接url
            String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false";// 数据库地址
            // 数据库用户名和密码
            String user = "root";
            String password = "123456";
            // 创建连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false", user, password);

            // 执行查询语句
            String sql = "SELECT * FROM user";

//            String sql2 = "Insert into user values(3,'wangwu','北京市西城区')";
            // 创建Statement对象
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            // 执行查询语句
//            int count = stmt2.executeUpdate(sql2);
//            System.out.println("影响行数：" + count);
            ResultSet rs = stmt.executeQuery(sql);
            //显示查询记录
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("name"));
                //System.out.println(rs.getString("id") + " " + rs.getString("name"));
                System.out.println(rs.getString("name")+" "+rs.getString("name"));
                System.out.println(rs.getString("address")+" "+rs.getString("address"));
            }
            conn.close();
            stmt.close();
            stmt2.close();
            if (conn!= null) {
                System.out.println("连接成功！");
            } else {
                System.out.println("连接失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接失败！");
        }
    }
}
