# 创建数据库(判断不存在)
CREATE DATABASE IF NOT EXISTS db_test2;

# 创建数据库并设置数据集（默认字符集是utf-8）
CREATE DATABASE IF NOT EXISTS db_test2 CHARACTER SET GBK;

# 查询所有数据库名称
SHOW DATABASES;

# 查询某个数据库的字符集类型
SHOW CREATE DATABASE db_test2; 

# 修改数据库字符集
ALTER DATABASE db_test2 CHARACTER SET utf8;

SHOW CREATE DATABASE db_test2; 

# 删除数据库
DROP DATABASE IF EXISTS db_test2;

# 查询正在使用的数据库名称
SELECT DATABASE();

# 使用数据库
USE db_test2;

# 创建表
CREATE TABLE students(
    stu_no Char(4),
    stu_name VarChar(20),
    stu_age Int,
    stu_score Double(4,1),
    stu_birth Date,
    insert_time TimeStamp DEFAULT CURRENT_TIMESTAMP        
    );
    
# 复制表
CREATE TABLE stu LIKE students;

# 查询数据库中的表
SHOW TABLES;

# 查询表结构
DESC students;

# 修改表名
ALTER TABLE students RENAME TO student;

# 增加列
ALTER TABLE student ADD sex Char(4);

DESC student;

# 调整字段顺序（是否不需要，只要在查询的时候改变字段顺序即可）

# 删除字段
ALTER TABLE student DROP sex;

# 修改字段名称，类型
ALTER TABLE student CHANGE sex courses VarChar(20);

DESC student;

# 仅仅修改字段类型
ALTER TABLE student MODIFY courses VarChar(40);

DESC student;

ALTER TABLE student DROP courses;

# 删除表
DROP TABLE stu;

SHOW TABLES;

# 添加数据
INSERT INTO student(stu_no, stu_name, stu_age)
VALUES ("1001", "韦小宝", 20);

INSERT INTO student(stu_no, stu_name, stu_age, stu_score, stu_birth, insert_time)
VALUES ("1002", "杨过", 21, 80.5, "1996-05-20", now());

INSERT INTO student(stu_no, stu_name, stu_age, stu_score, stu_birth)
VALUES ("1003", "小龙女", 23, 67.5, "1994-06-24");

# 查询数据
SELECT * FROM student;

# 删除数据
DELETE FROM student WHERE stu_no = "1001";

SELECT * FROM student;

INSERT INTO student(stu_no, stu_name, stu_age)
VALUES ("1001", "韦小宝", 20);

# 修改数据
UPDATE student SET stu_score = 100, stu_birth = "1996-5-6"
WHERE stu_no = "1001";

UPDATE student SET stu_age = 21, stu_score = 90 
WHERE stu_no = "1002";

SELECT * FROM student;