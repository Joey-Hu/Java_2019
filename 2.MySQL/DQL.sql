USE employees;

SHOW TABLES;

DESC employees;

DESC salaries;

# 排序查询
SELECT * FROM salaries ORDER BY salary DESC;

# 聚合函数-count
SELECT COUNT(*) FROM salaries;

# 聚合函数-max
SELECT MAX(salary) FROM salaries;

# 聚合函数-min
SELECT MIN(salary) FROM salaries;

# 聚合函数-sum
SELECT SUM(salary) FROM salaries;

# 聚合函数-AVG
SELECT AVG(salary) FROM salaries;














































