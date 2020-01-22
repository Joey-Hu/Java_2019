# 查询用户
USE mysql;

SELECT * FROM USER;

# 创建用户
# 语法：CREATE USER "用户名"@"主机名" IDENTIFIED BY "密码";
CREATE USER "huhao"@"localhost" IDENTIFIED BY "hh123456";

# 删除用户
# 语法：DROP USER "用户名"@"主机名"
DROP USER "huhao"@"localhost";

# 修改用户密码
# 语法：UPDATE USER SET PASSWORD = PASSWORD("新密码") WHERE USER = "用户名";
UPDATE USER SET PASSWORD = PASSWORD("abc") WHERE USER = "huhao";