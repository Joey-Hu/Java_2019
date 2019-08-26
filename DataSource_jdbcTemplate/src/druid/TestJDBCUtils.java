package druid;

import util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: huhao
 * @time: 2019/8/26 9:07
 * @desc:
 */
public class TestJDBCUtils {
    public static void main(String[] args) {
        /**
         * 完成添加操作，给account表添加一条记录
         */
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 1. 获取连接
            conn = JDBCUtils.getConnection();
            // 2. 定义sql
            String sql = "INSERT INTO accounts VALUES (?, ?, ?);";
            // 3. 获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            // 4. 给？赋值
            pstmt.setInt(1, 3);
            pstmt.setString(2, "王五");
            pstmt.setDouble(3, 2000);
            // 5. 执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. 释放资源
            JDBCUtils.close(pstmt, conn);
        }
    }
}
