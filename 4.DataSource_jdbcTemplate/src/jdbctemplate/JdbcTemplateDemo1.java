package jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

/**
 * @author: huhao
 * @time: 2019/8/26 15:41
 * @desc: JdbcTemplate入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // 1. 导入jar包
        // 2. 创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "UPDATE accounts SET balance = ? WHERE accnt_no = ?";
        // 3. 调用JdbcTemplate的方法
        int count = jdbcTemplate.update(sql, 4000, 3);
        System.out.println(count);
    }
}
