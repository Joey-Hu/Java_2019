package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import druid.DruidDemo1;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: huhao
 * @time: 2019/8/26 8:48
 * @desc: 连接池工具类
 */
public class JDBCUtils {

    private static DataSource ds;

    static {
        Properties pro = new Properties();
        InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
       return ds.getConnection();
    }

    /**
     * 释放资源
     */

    public static void close(Statement stmt, Connection conn) {

        close(null, stmt, conn);
    }

    /**
     * 释放资源
     */

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
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

    /**
     * 获取连接池方法
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
