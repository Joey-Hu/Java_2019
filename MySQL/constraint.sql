# 添加非空约束（创建表时）
CREATE TABLE stu (
    stu_no Int,
    stu_name VarChar(20) NOT NULL
);

SELECT * FROM stu;

INSERT INTO stu(stu_no, stu_name) 
VALUES (1, "张三");

INSERT INTO stu(stu_no, stu_name) 
VALUES (1, NULL);

# 删除非空约束
ALTER TABLE stu MODIFY stu_name VarChar(20);

# 添加非空约束（创建表后）
ALTER TABLE stu MODIFY stu_name varchar(20) NOT NULL;

DESC stu;

# 创建表时添加唯一约束
CREATE TABLE stu2 (
    stu_no Int,
    phone_num varchar(20) UNIQUE
);

DESC stu2;

# 删除唯一约束
ALTER TABLE stu2 DROP INDEX phone_num;

# 添加唯一约束（创建表后）
ALTER TABLE stu2 MODIFY phone_num varchar(20) UNIQUE;

INSERT INTO stu2(stu_no, phone_num) 
VALUES (1, 1111);


# 创建表时添加主键
CREATE TABLE stu3 (
    stu_no int PRIMARY KEY,
    stu_name VarChar(20)    
);

DESC stu3;

# 删除主键
ALTER TABLE stu3 DROP PRIMARY KEY;

# 添加主键（表创建完后）
ALTER TABLE stu MODIFY stu_no INT PRIMARY KEY;

# 自动增长
CREATE TABLE stu4 (
    stu_no int PRIMARY KEY AUTO_INCREMENT,
    stu_name VarChar(20)    
);

# 删除自动增长
 ALTER TABLE stu4 MODIFY stu_no Int;
 
 # 添加自动增长
 ALTER TABLE stu4 MODIFY stu_no Int AUTO_INCREMENT;

# 外键约束














