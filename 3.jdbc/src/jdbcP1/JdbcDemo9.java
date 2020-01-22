package jdbcP1;

import domain.Emp;
import util.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: huhao
 * @time: 2019/8/20 15:21
 * @desc: 查询employee表的数据将其封装为对象，然后打印
 */
public class JdbcDemo9 {

    /**
     * 演示JDBC工具类
     * @return
     */
    public List<Emp> findAll() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        List<Emp> list = null;

        try {
           /* // 1. 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test?serverTimezone=UTC", "root", "hh123456");*/
           conn = JdbcUtils.getConnnection();
            // 3. 定义sql语句
            String sql = "SELECT * FROM employee;";
            // 3. 获取执行sql语句对象
            stmt = conn.createStatement();
            // 4. 执行sql语句
            rs = stmt.executeQuery(sql);
            // 5. 处理结果
            Emp emp = null;
            list = new ArrayList<Emp>();
            while(rs.next()) {
                // 获取数据
                int emp_no = rs.getInt("emp_no");
                String emp_name = rs.getString("emp_name");
                int job_no = rs.getInt("job_no");
                int manager = rs.getInt("manager");
                Date join_date = rs.getDate("join_date");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_no = rs.getInt("dept_no");

                /**
                 * 这种方式不好，会导致后面多次引用占用内存
                 * 可以在循环外引用一次，然后复用引用即可
                 * Emp emp = new Emp();
                 */

                // 创建emp对象
                emp = new Emp();
                emp.setEmp_no(emp_no);
                emp.setEmp_name(emp_name);
                emp.setJob_no(job_no);
                emp.setManager(manager);
                emp.setJoin_date(join_date);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_no(dept_no);

                // 装载集合
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           /* try {
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }*/
            JdbcUtils.close(rs, stmt, conn);
        }

        return list;
    }

    public static void main(String[] args) {
         // 要引用非静态方法，需要创建对象
        List<Emp> list = new JdbcDemo9().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
}
