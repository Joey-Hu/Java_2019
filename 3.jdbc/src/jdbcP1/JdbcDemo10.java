package jdbcP1;

import util.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author: huhao
 * @time: 2019/8/22 10:27
 * @desc:
 *
 * 练习
 *     需求：
 *         通过键盘录入用户名和密码
 *         判断用户是否登陆成功
 */
public class JdbcDemo10 {

    /**
     * 登陆方法
     * @param userName
     * @param password
     * @return
     */
    public boolean logIn(String userName, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        if(userName == null || password == null) {
            return false;
        }
        // 连接数据库判断是否登陆成功
        try {
            conn = JdbcUtils.getConnnection();
            String sql = "SELECT * FROM test_user WHERE user_name = '" + userName + "' AND user_password = '" + password +"';";
            System.out.println(sql);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

          /*  // 如果有下一行，则返回true
            if(rs.next()) {
                return true;
            }*/
          return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(rs, stmt, conn);
        }

        return false;
    }

    /**
     * 登陆方法，使用Preparedstatement
     * @param userName
     * @param password
     * @return
     */
    public boolean logIn2(String userName, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        if(userName == null || password == null) {
            return false;
        }

        // 连接数据库判断是否登陆成功
        try {
            conn = JdbcUtils.getConnnection();
            String sql = "SELECT * FROM test_user WHERE user_name = ? AND user_password = ?;";
            pstmt = conn.prepareStatement(sql);
            // 给？赋值
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();

          /*  // 如果有下一行，则返回true
            if(rs.next()) {
                return true;
            }*/
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(rs, pstmt, conn);
        }

        return false;
    }

    public static void main(String[] args) {
        // 键盘输入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        // 调用方法
        // 使用非静态方法必须先实例化类
        boolean result = new JdbcDemo10().logIn2(userName, password);

        if(result) {
            System.out.println("登陆成功!");
        } else {
            System.out.println("用户名或密码错误!");
        }
    }

}
