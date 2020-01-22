package jdbcP1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: huhao
 * @time: 2019/8/17 15:46
 * @desc: accounts表 删除一条记录
 */
public class JdbcDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?serverTimezone=UTC", "root", "hh123456");
            // sql语句
            String sql = "DELETE FROM accounts WHERE accnt_no = 3;";
            // 获取执行sql的对象
            stmt = conn.createStatement();
            // 执行sql语句
            int count = stmt.executeUpdate(sql);
            // 处理结果
            System.out.println(count);
            if(count >0) {
                System.out.println("删除成功");
            }
            else {
                System.out.println("删除失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {    // 释放资源
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
