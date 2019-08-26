package jdbctemplate.domain;

import java.util.Date;

/**
 * @author: huhao
 * @time: 2019/8/26 16:20
 * @desc:
 */
public class Emp {
    private Integer emp_no;
    private String emp_name;
    private Integer job_no;
    private Integer manager;
    private Date join_date;
    private Double salary;
    private Double bonus;
    private Integer dept_no;


    public Integer getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(Integer emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getJob_no() {
        return job_no;
    }

    public void setJob_no(Integer job_no) {
        this.job_no = job_no;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Integer getDept_no() {
        return dept_no;
    }

    public void setDept_no(Integer dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_no=" + emp_no +
                ", emp_name='" + emp_name + '\'' +
                ", job_no=" + job_no +
                ", manager=" + manager +
                ", join_date=" + join_date +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_no=" + dept_no +
                '}';
    }
}
