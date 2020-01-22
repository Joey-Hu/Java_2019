package chapter4.cn.sxt.hu;

import chapter4.cn.sxt.oo.User;      //导入User类
import java.sql.Date;
import java.util.*;
/**
 * @author: huhao
 * @time: 2019/7/15 13:00
 * @desc:
 */
public class User2 {
    public static void main(String[] args) {
        User user = new User();

        //这里指的是java.sql.Date
        Date now;
        //java.util.Date因为和java.sql.Date类同名，需要完整路径
        java.util.Date now2 = new java.util.Date();
        System.out.println(now2);
        //java.util包的非同名类不需要完整路径
        Scanner input = new Scanner(System.in);

    }
}
