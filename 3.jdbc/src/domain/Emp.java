package domain;

import java.util.Date;

/**
 * @author: huhao
 * @time: 2019/8/20 15:15
 * @desc: 封装employee表的JavaBean
 */
public class Emp {
    private int emp_no;
    private String emp_name;
    private int job_no;
    private int manager;
    private Date join_date;
    private double salary;
    private double bonus;
    private int dept_no;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getJob_no() {
        return job_no;
    }

    public void setJob_no(int job_no) {
        this.job_no = job_no;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
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
                ", dept_no=" + dept_no  +
                '}' + "\n";
    }
}
