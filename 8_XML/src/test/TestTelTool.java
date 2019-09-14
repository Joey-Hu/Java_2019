package test;

import util.TelTool;

import java.util.Scanner;

/**
 * @author: huhao
 * @time: 2019/9/14 21:39
 * @desc:
 */
public class TestTelTool {
    public static void main(String[] args) {
        while(true) {
            System.out.println("欢迎使用通讯录,请输入相应数字选择功能:");
            System.out.println("1.添加联系人");
            System.out.println("2.编辑联系人");
            System.out.println("3.删除联系人");
            System.out.println("4.查找联系人");

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            // 创建工具类对象
            TelTool tt = new TelTool();

            switch (i) {
                case 1:
                    System.out.println("请输入联系人姓名");
                    String name=sc.next();
                    System.out.println("请输入电话号码");
                    String num=sc.next();
                    tt.addNum(name, num);
                    break;
                default:
                    System.out.println("输入错误");
            }
        }



    }
}
