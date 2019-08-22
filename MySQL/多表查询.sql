# 创建数据库和表
CREATE DATABASE db_test;

USE db_test;

CREATE TABLE department(
    dept_no Int PRIMARY KEY AUTO_INCREMENT,
    dept_name VarChar(100)
);

INSERT INTO department(dept_name) 
VALUES ("开发部"), ("市场部"), ("财务部");

CREATE TABLE employee(
    emp_no Int PRIMARY KEY AUTO_INCREMENT,
    emp_name VarChar(20),
    sex VarChar(10),
    salary Double,
    join_date Date,
    dept_no Int,
    FOREIGN KEY (dept_no) REFERENCES department(dept_no)
);

INSERT INTO employee(emp_name, sex, salary, join_date, dept_no) 
VALUES ("孙悟空", "男", 7200, "2013-02-24", 1);

INSERT INTO employee(emp_name, sex, salary, join_date, dept_no) 
VALUES ("猪八戒", "男", 3600, "2010-12-02", 2);

INSERT INTO employee(emp_name, sex, salary, join_date, dept_no) 
VALUES ("唐僧", "男", 9000, "2008-08-08", 2);

INSERT INTO employee(emp_name, sex, salary, join_date, dept_no) 
VALUES ("白骨精", "女", 5000, "2015-10-07", 3);

INSERT INTO employee(emp_name, sex, salary, join_date, dept_no) 
VALUES ("蜘蛛精", "女", 4500, "2011-03-14", 1);


# 笛卡儿积
SELECT * FROM employee, department;

# 隐式内连接 查询所有员工信息和对应部门信息
SELECT * FROM employee, department WHERE employee.dept_no = department.dept_no;

# 隐式内连接 查询所有员工名称，性别和部门名称
SELECT emp_name, sex, dept_name FROM employee, department WHERE employee.dept_no = department.dept_no;

# 使用表别名
SELECT t1.emp_name, t1.sex, t2.dept_name 
FROM employee t1, department t2
WHERE t1.dept_no = t2.dept_no;

# 显式内连接
SELECT * FROM employee INNER JOIN department ON employee.dept_no = department.dept_no;
SELECT * FROM employee JOIN department ON employee.dept_no = department.dept_no;

# 左外连接
INSERT INTO employee(emp_name, sex, salary) 
VALUES ("小白龙", "男", 3000);

SELECT * FROM employee;

# 查询所有员工信息，如果员工有部门，则查询部门名称，没有部门，则不显示部门名称
SELECT employee.emp_no, employee.emp_name, employee.sex, employee.salary, employee.join_date, department.dept_name
FROM employee LEFT JOIN department
ON employee.dept_no = department.dept_no;

SELECT t1.*, t2.dept_name
FROM employee t1 LEFT JOIN department t2
ON t1.dept_no = t2.dept_no;

# 右外连接
SELECT t1.*, t2.dept_name
FROM employee t1 RIGHT JOIN department t2
ON t1.dept_no = t2.dept_no;

# 子查询 查询工资最高的员工信息
SELECT *
FROM employee
WHERE salary = (
    SELECT MAX(salary)
    FROM employee
);

# 子查询 查询工资小于平均工资的员工信息
SELECT *
FROM employee
WHERE salary < (
    SELECT AVG(salary)
    FROM employee
);

# 子查询 查询财务部和市场部的所有员工信息
SELECT *
FROM employee
WHERE dept_no IN (
    SELECT dept_no
    FROM department
    WHERE dept_name IN ("财务部", "市场部")
);

# 子查询 查询员工入职日期是2011-11-11之后的员工信息和部门信息
SELECT *
FROM department t1, (SELECT * FROM employee WHERE join_date > "2011-11-11") t2
WHERE t1.dept_no = t2.dept_no;


SELECT *
FROM employee JOIN department
WHERE
employee.dept_no = department.dept_no
AND 
employee.emp_no IN (
    SELECT emp_no
    FROM employee
    WHERE join_date > "2011-11-11"
);




















