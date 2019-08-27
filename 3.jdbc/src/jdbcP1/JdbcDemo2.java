package jdbcP1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: huhao
 * @time: 2019/8/17 14:54
 * @desc: accounts表添加一条记录 insert语句
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        // 避免在finally代码块中找不到stmt和conn这两个局部变量，要把他们定义成全局变量
        Statement stmt = null;
        Connection conn = null;

        // try catch才是处理异常的正确姿势，在写代码时，先不写try/catch，
        // 出现红色波浪线（可能出现异常）时，按【alt + enter】，选择【surround with try/catch】
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接对象
            // 在写代码时，先写DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "hh123456");，
            // 然后出现异常，需要将返回值赋值给一个变量，按【alt + enter】，选择【introduce local variable】
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?serverTimezone = UTC", "root", "hh123456");
            // 3. 定义sql
            String sql = "INSERT INTO accounts(accnt_no, user_name, balance) VALUES (3, '王五', 3000);";
            // 4. 获取Statement对象
            stmt = conn.createStatement();
            // 5. 执行sql
            // count指代的是影响的行数
            int count = stmt.executeUpdate(sql);
            // 6. 处理结果
            System.out.println(count);
            if(count > 0) {
                System.out.println("添加成功");
            }
            else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {     // 释放资源操作应该写在finally的代码块中（无论如何都要执行），为避免空指针异常，写使用try/catch结构
            try {
                if(stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
