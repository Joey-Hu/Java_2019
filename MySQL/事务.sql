CREATE TABLE accounts(
    accnt_no Int PRIMARY KEY AUTO_INCREMENT,
    user_name VarChar(20),
    balance Double
);

INSERT INTO accounts (user_name, balance) VALUES ("zhangsan", 1000), ("lisi", 1000);

SELECT * FROM accounts;

# 张三给李四转账500
# 0.开启事务
START TRANSACTION;
# 1.张三账户 -500
UPDATE accounts SET balance = balance - 500 WHERE user_name = "zhangsan";

出错了...

# 2.李四账户 +500  
UPDATE accounts SET balance = balance + 500 WHERE user_name = "lisi";

# 提交
COMMIT;

# 出错了
ROLLBACK;














