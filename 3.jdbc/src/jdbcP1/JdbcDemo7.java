package jdbcP1;

import java.sql.*;

/**
 * @author: huhao
 * @time: 2019/8/20 15:00
 * @desc: ResultSet 遍历结果集
 */
public class JdbcDemo7 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?serverTimezone=UTC", "root", "hh123456");
            // 3. 定义sql
            String sql = "SELECT * FROM accounts;";
            // 4. 获取执行sql对象
            stmt = conn.createStatement();
            // 5. 执行sql
            rs = stmt.executeQuery(sql);
            // 6.处理结果
            // 6.1 游标向下移动一行（默认指向第一行数据之前）
            while (rs.next()){
                // 6.2 获取数据
                int accnt_no = rs.getInt("accnt_no");
                String user_name = rs.getString("user_name");
                double balance = rs.getDouble("balance");
                System.out.println(accnt_no + "----" + user_name + "----" + balance);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

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
