package practice.P2;

import java.util.Scanner;

/**
 * @author: huhao
 * @time: 2019/8/23 7:32
 * @desc:
 */
public class TestRelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("第二个整数：");
        int num2 = sc.nextInt();

        System.out.println("比较" + num1 + ">" + num2 + ":" + (num1>num2));
    }
}
