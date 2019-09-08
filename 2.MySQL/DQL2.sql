USE db_test2;

CREATE TABLE stu(
    stu_id int,
    stu_name VarChar(20),
    stu_age Int,
    stu_address VarChar(20),
    math Int,
    english Int    
)

SHOW TABLES;

ALTER TABLE stu RENAME TO grades;

ALTER TABLE grades ADD stu_sex Char(10) AFTER stu_age;

DESC grades;

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (1, "马云", 55, "男", "杭州", 66, 78);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (2, "马化腾", 45, "女", "深圳", 98, 87);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (3, "马景涛", 55, "男", "香港", 56, 77);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (4, "柳岩", 20, "女", "湖南", 76, 65);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (5, "柳青", 20, "男", "湖南", 86, null);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (6, "刘德华", 57, "男", "香港", 99, 99);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (7, "马德", 22, "女", "香港", 99, 99);

INSERT INTO grades(stu_id, stu_name, stu_age, stu_sex, stu_address, math, english)
VALUES (8, "德玛西亚", 18, "男", "南京", 56, 65);

SELECT * FROM grades;

# 分组查询 按照性别分组，分别查找男、女同学的平均分
SELECT stu_sex, AVG(math), AVG(english) FROM grades GROUP BY stu_sex;

# 分组查询 按照性别分组，分别查找男、女同学的平均分、人数
SELECT stu_sex, AVG(math), AVG(english), COUNT(stu_sex) FROM grades GROUP BY stu_sex;

# 分组查询 按照性别分组，分别查找男、女同学的平均分、人，分数低于70分的人不参与分组
SELECT stu_sex, AVG(math), COUNT(stu_sex) FROM grades WHERE math > 70 GROUP BY stu_sex;

# 分组查询 按照性别分组，分别查找男、女同学的平均分、人，分数低于70分的人不参与分组，分组之后人数要大于2个人(别名操作)
SELECT stu_sex, AVG(math), COUNT(stu_sex) stu_num FROM grades WHERE math > 70 GROUP BY stu_sex HAVING stu_num > 2;

# 分页查询 每页显示3条记录
SELECT * FROM grades LIMIT 0,3;   -- 第一页
SELECT * FROM grades LIMIT 3,3;   -- 第二页
SELECT * FROM grades LIMIT 6,3;   -- 第三页

# 去除重复的结果集
SELECT DISTINCT stu_address FROM grades;

# 字段间的操作
SELECT stu_name, math, english, math + english 
FROM grades; -- 如果有null参与的运算，计算结果都为null

SELECT stu_name, math, english, math + IFNULL(english, 0) 
FROM grades;

# 查询年龄大于20
SELECT * FROM grades WHERE stu_age > 20;

# 查询年龄等于20
SELECT * FROM grades WHERE stu_age = 20;

# 查询年龄不等于20
SELECT * FROM grades WHERE stu_age != 20;

# 查询年龄大于等于20，小于等于30
SELECT * FROM grades WHERE stu_age >= 20 AND stu_age <= 30;
SELECT * FROM grades WHERE stu_age BETWEEN 20 AND 30;   -- 闭区间

# 查询年龄22，18，25岁人的信息
SELECT * FROM grades WHERE stu_age =22 OR stu_age = 18 OR stu_age = 25;
SELECT * FROM grades WHERE stu_age IN (22, 18, 25);

# 查询英语成绩为null的元组 -- NULL值不能使用= （!=）判断
SELECT * FROM grades WHERE english IS NULL;

# 查询英语成绩不为null的元组
SELECT * FROM grades WHERE english IS NOT NULL;

# 查询姓马的元组
SELECT * FROM grades WHERE stu_name LIKE "马%";

# 查询第二个字是化的人
SELECT * FROM grades WHERE stu_name LIKE "_化%";

# 查询姓名是三个字的人
SELECT * FROM grades WHERE stu_name LIKE "___";

# 查询姓名包含马的人
SELECT * FROM grades WHERE stu_name LIKE "%马%";
















