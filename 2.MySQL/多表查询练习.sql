USE db_test;
SHOW TABLES;

DROP TABLE department;
DROP TABLE employee;

# 多表查询练习
# 创建表和添加数据
# 部门表
CREATE TABLE department(
    dept_no Int PRIMARY KEY,
    dept_name VarChar(40),
    dept_loc VarChar(100)
);

INSERT INTO department(dept_no, dept_name, dept_loc)
VALUES (10, "教研部", "北京"), (20, "学工部", "上海"), (30, "销售部", "广州"), (40, "财务部", "深圳");

CREATE TABLE job(
    job_no Int PRIMARY KEY,
    job_name VarChar(20),
    description VarChar(100)
);

INSERT INTO job(job_no, job_name, description)
VALUES 
(1, "董事长", "管理整个公司，接单"), 
(2, "经理", "管理部门员工"), 
(3, "销售员", "向客户推销产品"), 
(4, "文员", "使用办公软件");

CREATE TABLE employee(
    emp_no Int PRIMARY KEY,
    emp_name VarChar(20),
    job_no Int,
    manager Int,
    join_date Date,
    salary Decimal(7,2),
    bonus Decimal(7,2),
    dept_no Int,
    CONSTRAINT emp_job_jobno_fk FOREIGN KEY (job_no) REFERENCES job(job_no),
    CONSTRAINT emp_dept_deptno_fk FOREIGN KEY (dept_no) REFERENCES department(dept_no)
);

INSERT INTO employee(emp_no, emp_name, job_no, manager, join_date, salary, bonus, dept_no)
VALUES
(1001, "孙悟空", 4, 1004, "2000-12-17", 8000.00, NULL, 20), 
(1002, "卢俊义", 3, 1006, "2001-02-20", 16000.00, 3000.00, 30), 
(1003, "林冲", 3, 1006, "2001-02-22", 12500.00, 5000, 30), 
(1004, "唐僧", 2, 1009, "2001-04-02", 29750.00, NULL, 20), 
(1005, "李逵", 4, 1006, "2001-09-28", 12500.00, 14000.00, 30), 
(1006, "宋江", 2, 1009, "2001-05-01", 28500.00, NULL, 30), 
(1007, "刘备", 2, 1009, "2001-09-01", 24500.00, NULL, 10), 
(1008, "猪八戒", 4, 1004, "2007-04-19", 30000.00, NULL, 20), 
(1009, "罗贯中", 1, NULL, "2001-11-17", 50000.00, NULL, 10), 
(1010, "吴用", 3, 1006, "2001-09-08", 15000.00, 0.00, 30), 
(1011, "沙僧", 4, 1004, "2007-05-23", 11000.00, NULL, 20), 
(1012, "李逵", 4, 1006, "2001-12-03", 9500.00, NULL, 30), 
(1013, "小白龙", 4, 1004, "2001-12-03", 30000.00, NULL, 20), 
(1014, "关羽", 4, 1007, "2002-01-23", 13000.00, NULL, 10);

CREATE TABLE salarygrade(
    garde Int PRIMARY KEY,
    losalary Int,
    hisalary Int
);

ALTER TABLE salarygrade CHANGE garde grade Int;

INSERT INTO salarygrade(grade, losalary, hisalary) 
VALUES 
(1, 7000, 12000), 
(2, 12010, 14000), 
(3, 14010, 20000), 
(4, 20010, 30000), 
(5, 30010, 99990); 

DESC salarygrade;

# 需求：
# 1. 查询所有员工信息。查询员工编号，员工姓名，工资，职务名称，职务描述
SELECT t1.emp_no, t1.emp_name, t1.salary, t2.job_name, t2.description
FROM employee t1 JOIN job t2
WHERE t1.job_no = t2.job_no
ORDER BY emp_no;

# 2. 查询员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
SELECT t1.emp_no, t1.emp_name, t1.salary, t2.job_name, t2.description, t3.dept_name, t3.dept_loc
FROM employee t1 JOIN job t2 JOIN department t3
WHERE t1.job_no = t2.job_no AND t1.dept_no = t3.dept_no;

# 3. 查询员工姓名，工资，工资等级
SELECT t1.emp_name, t1.salary, t2.*
FROM employee t1, salarygrade t2
WHERE t1.salary BETWEEN t2.losalary AND t2.hisalary;

# 4. 查询员工姓名，工资，职务名称，职务描述，部门名称，部门位置，工资等级
SELECT t1.emp_name, t1.salary, t2.job_name, t2.description, t3.dept_name, t3.dept_loc, t4.*
FROM employee t1, job t2, department t3, salarygrade t4
WHERE t1.job_no = t2.job_no AND t1.dept_no = t3.dept_no AND t1.salary BETWEEN t4.losalary AND t4.hisalary;

# 5. 查询部门编号，部门名称，部门位置，部门人数
SELECT t1.dept_no, t1.dept_name, t1.dept_loc, COUNT(t2.dept_no)
FROM department t1 JOIN employee t2
WHERE t1.dept_no = t2.dept_no
GROUP BY t1.dept_no;

# 方法二
SELECT t1.dept_no, t1.dept_name, t1.dept_loc, t2.total 
FROM department t1, (
    SELECT dept_no, COUNT(emp_no) total
    FROM employee
    GROUP BY dept_no
) t2
WHERE t1.dept_no = t2.dept_no;

# 6. 查询所有员工的姓名及其直接上级的姓名，没有领导的员工也需要查询
SELECT t1.emp_name, t1.manager, t2.emp_no, t2.emp_name
FROM employee t1 LEFT JOIN employee t2
ON t1.manager = t2.emp_no;

DESC employee;