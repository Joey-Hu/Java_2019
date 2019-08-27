package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author: huhao
 * @time: 2019/8/22 7:06
 * @desc:
 */
public class JdbcUtils {

    /**
     * 只有静态变量才能被静态代码块，静态方法调用
     */
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /**
     * 文件的读取，只需要一次读取即可拿到这些值，使用静态代码块
     */
    static {
        // 读取配置文件，获取值

        try {
            Properties pro = new Properties();
            pro.load(new FileReader("D:\\Desktop\\JAVA\\Java\\jdbc\\src\\util\\jdbc.properties"));
            // 获取src路径下的文件方式：ClassLoader 类加载器
            /*pro.load(new FileReader("../src/jdbc.properties"));*/

            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");

            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return 连接对象
     */
    public static Connection getConnnection() throws SQLException {

            return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt, Connection conn) {
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 释放资源
     * @param rs
     * @param stmt
     * @param conn
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 释放资源
     * @param stmt1
     * @param stmt2
     */
    public static void close(Statement stmt1, Statement stmt2, Connection conn) {
        if(stmt1 != null){
            try {
                stmt1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stmt2 != null){
            try {
                stmt2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
