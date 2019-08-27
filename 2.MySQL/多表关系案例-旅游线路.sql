USE db_test2;
/* 案例：旅游路线*/

# 旅游线路分类
CREATE TABLE tab_category(
    cid Int PRIMARY KEY AUTO_INCREMENT,
    cname VarChar(100) NOT NULL UNIQUE
);

# 旅游线路表
CREATE TABLE tab_toute(
    rid Int PRIMARY KEY AUTO_INCREMENT,
    rname VarChar(100) NOT NULL UNIQUE,
    price Double,
    rdate Date,
    cid Int,
    FOREIGN KEY (cid) REFERENCES tab_category(cid)
);

# 用户表
CREATE TABLE tab_user(
    uid Int PRIMARY KEY AUTO_INCREMENT,
    uname VarChar(100) NOT NULL UNIQUE,
    pwd VarChar(100) NOT NULL,
    real_name VarChar(100),
    birthday Date,
    sex VarChar(10) DEFAULT "男",
    telephone VarChar(11),
    email VarChar(100)
);

# 用户收藏表
CREATE TABLE tab_favourite(
    uid Int,
    rid Int,
    PRIMARY KEY (uid, rid),
    fdate DateTime,
    FOREIGN KEY (uid) REFERENCES tab_user(uid),
    FOREIGN KEY (rid) REFERENCES tab_route(rid)
);

SELECT DATABASE();