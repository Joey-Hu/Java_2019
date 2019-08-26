package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author: huhao
 * @time: 2019/8/26 8:28
 * @desc:
 */
public class DruidDemo1 {
    public static void main(String[] args) {
        Connection conn = null;

        // 1. 导入jar包
        // 2. 定义配置文件
        // 3. 加载配置文件
        Properties pro = new Properties();
        InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            // 4. 获取数据库连接池对象
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
            conn = ds.getConnection();
            System.out.println(conn);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
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
