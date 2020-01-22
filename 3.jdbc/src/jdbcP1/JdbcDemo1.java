package jdbcP1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author: huhao
 * @time: 2019/8/17 8:31
 * @desc: JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {

        // 1. 导入驱动jar包
        // 2. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 3. 获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?serverTimezone = UTC", "root", "hh123456");
        // 4. 定义sql语句
        String sql = "UPDATE accounts SET balance = 1000 WHERE accnt_no = 1";
        // 5. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        // 6. 执行sql
        int count = stmt.executeUpdate(sql);
        // 7. 处理结果
        System.out.println(count);
        // 8. 释放资源
        stmt.close();
        conn.close();

    }
}
