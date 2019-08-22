package jdbcP1;


import util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: huhao
 * @time: 2019/8/22 16:33
 * @desc: 事务操作
 */
public class JdbcDemo11 {

    /**
     * 转账操作
     */
    public void transaction() {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            conn = JdbcUtils.getConnnection();
            // 开启事务
           conn.setAutoCommit(false);
            String sql1 = "UPDATE accounts set balance = balance - ? WHERE accnt_no  = ?;";
            String sql2 = "UPDATE accounts set balance = balance + ? WHERE accnt_no = ?;";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);

            pstmt2.setDouble(1, 500);
            pstmt2.setInt(2, 2);

            pstmt1.executeUpdate();
            // 手动制造异常
            int i = 3 / 0;
            pstmt2.executeUpdate();

            // 提交事务
            conn.commit();


        } catch (Exception e) {
            // 此时要注意，不管发生什么异常，事务都要回滚，所以上一行catch中的异常要是一个大异常Exception
            try {
                if(conn != null){
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JdbcUtils.close(pstmt1, pstmt2, conn);
        }
    }

    public static void main(String[] args) {
        new JdbcDemo11().transaction();
    }
}
