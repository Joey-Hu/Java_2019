package c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: huhao
 * @time: 2019/8/26 7:50
 * @desc:
 */
public class C3P0Demo2 {
    public static void main(String[] args) {
         Connection conn = null;
        // 1. 创建数据库连接池对象，使用默认配置
        DataSource ds = new ComboPooledDataSource();
        for (int i = 0; i < 15; i++) {
            /**
             * 这里问你什么可以获取15个连接？（明明配置文件中最大只能10个）
             * 结果：
             *   0: com.mchange.v2.c3p0.impl.NewProxyConnection@1fbc7afb [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 1: com.mchange.v2.c3p0.impl.NewProxyConnection@7e0babb1 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 2: com.mchange.v2.c3p0.impl.NewProxyConnection@2ff4f00f [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 3: com.mchange.v2.c3p0.impl.NewProxyConnection@3f0ee7cb [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 4: com.mchange.v2.c3p0.impl.NewProxyConnection@7d417077 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 5: com.mchange.v2.c3p0.impl.NewProxyConnection@35bbe5e8 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 6: com.mchange.v2.c3p0.impl.NewProxyConnection@5a39699c [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 7: com.mchange.v2.c3p0.impl.NewProxyConnection@56cbfb61 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 8: com.mchange.v2.c3p0.impl.NewProxyConnection@d041cf [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 9: com.mchange.v2.c3p0.impl.NewProxyConnection@1b0375b3 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 10: com.mchange.v2.c3p0.impl.NewProxyConnection@2d209079 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 11: com.mchange.v2.c3p0.impl.NewProxyConnection@6b71769e [wrapping: com.mysql.cj.jdbc.ConnectionImpl@6debcae2]
                 12: com.mchange.v2.c3p0.impl.NewProxyConnection@e580929 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@1cd072a9]
                 13: com.mchange.v2.c3p0.impl.NewProxyConnection@4c203ea1 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@45c8e616]
                 14: com.mchange.v2.c3p0.impl.NewProxyConnection@1d251891 [wrapping: com.mysql.cj.jdbc.ConnectionImpl@1cd072a9]
             * 我们可以看到结果的每个一个的hashcode值一样，因为每次获取连接之后，使用完会归还连接给数据库连接池，释放资源，所以能超过15个
             */
            try {
                // 2. 获取连接对象
                conn = ds.getConnection();
                System.out.println(i + ": " + conn);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
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

    public void testNameConfig() {
        Connection conn = null;

        // 1.1 创建数据库连接池对象，使用制定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for (int i = 0; i < 8; i++) {
            try {
                // 2. 获取连接对象
                conn = ds.getConnection();
                System.out.println(i + ": " + conn);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
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
}
