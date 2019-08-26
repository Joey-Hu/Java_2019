package jdbctemplate.example;

import jdbctemplate.domain.Emp;
import jdk.management.resource.internal.TotalResourceContext;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import util.JDBCUtils;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author: huhao
 * @time: 2019/8/26 16:24
 * @desc:
 *
修改1号数据的salary为1000
 *
添加一条记录
 *
删除刚才添加的记录
 *
查询id为1记录，将其封装为map集合
 *
查询所有记录，将其封装为List
 *
查询所有记录，将其封装为Emp对象的List集合
 *
查询总记录数

 因为有很多方法需要写，所以这里使用Junit单元测试
 */
public class JdbcTemplateExample1 {


    /**
     * 修改1001号数据的salary为1000
     */
    @Test
    public void test1() {
        // 1. 获取JDBCTemplate对象,也可以把这个方法拿到外面
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "UPDATE employee SET salary = ? WHERE emp_no = ?;";
        // 2. 调用JdbcTemplate的方法
        int count = jdbcTemplate.update(sql, 1000, 1001);
        Assert.assertEquals(1, count);
    }

    /**
     * 添加一条记录
     */
    @Test
    public void test2() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        int count = jdbcTemplate.update(sql, 1015, "武松", 3, 1004, "2001-02-14", 2000, null, 10);
        Assert.assertEquals(1, count);
    }

    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "DELETE FROM employee WHERE emp_no = ?;";
        int count = jdbcTemplate.update(sql, 1015);
        Assert.assertEquals(1, count);
    }

    /**
     * 查询id为1001记录，将其封装为map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM employee WHERE emp_no = ?;";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1001);
        System.out.println(stringObjectMap);
    }

    /**
     * 查询所有记录，将其封装为List
     */
    @Test
    public void test5() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM employee;";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);

        // 代码简写，敲iter，会出现下面的遍历循环语句
        // 同理，敲fori, 就会出现如下所示的遍历循环语句： for (int i = 0; i < ; i++) {}
        // 更多相关缩写详见【Setting】-【Editor】-【live Template】-【iterations】
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     * 自动封装BeanPropertyRowMapper
     */
    @Test
    public void test6() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM employee;";
        List<Emp> list1 = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list1) {
            System.out.println(emp);
        }

        /**
         * 报错：org.springframework.beans.TypeMismatchException: Failed to convert property value of type 'null' to required type 'double' for property 'bonus'; nested exception is org.springframework.core.convert.ConversionFailedException: Failed to convert from type [null] to type [double] for value 'null'; nested exception is java.lang.IllegalArgumentException: A null value cannot be assigned to a primitive type
         * 原因：因为double和int基本数据类型不能赋值为null，只能赋值为0，而数据库中又有字段类型为double和int的值为null，所以报错
         * 解决: 将double和int类型改为引用数据类型的封装类Double和Integer(并且连带修改setter和getter方法)
         */
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     * 手动封装RowMapper
     */
    @Test
    public void test6_2() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "SELECT * FROM employee;";

        List<Emp> list = jdbcTemplate.query(sql, new RowMapper<Emp>() {

            @Override
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                Emp emp = new Emp();
                int emp_no = rs.getInt("emp_no");
                String emp_name = rs.getString("emp_name");
                int job_no = rs.getInt("job_no");
                int manager = rs.getInt("manager");
                Date join_date = rs.getDate("join_date");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_no = rs.getInt("dept_no");

                emp.setJob_no(emp_no);
                emp.setEmp_name(emp_name);
                emp.setJob_no(job_no);
                emp.setManager(manager);
                emp.setJoin_date(join_date);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_no(dept_no);

                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 查询总记录数，返回的是long类型的
     */
    @Test
    public void test7() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "SELECT COUNT(emp_no) FROM employee;";
        Long total = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
