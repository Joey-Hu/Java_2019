package c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.cj.exceptions.ConnectionIsClosedException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: huhao
 * @time: 2019/8/26 7:16
 * @desc: C3p0的演示
 */
public class C3P0Demo1 {
    public static void main(String[] args){
        // 1. 创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();

        // 2. 获取连接对象
        Connection conn = null;
        try {
            conn = ds.getConnection();
            // 3. 打印
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
