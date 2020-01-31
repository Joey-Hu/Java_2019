package practice.P2;

import java.util.Scanner;

/**
 * @author: huhao
 * @time: 2019/8/23 7:16
 * @desc:
 */
public class TestBMI {
    public static void main(String[] args) {
        double height = 0;
        double weight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高（M）:");
        height = sc.nextDouble();
        System.out.println("请输入体重（kg）:");
        weight = sc.nextDouble();

        double bmi = weight / (height*height);

        System.out.println("当前的BMI是: " +String.format("%.4f", bmi));
    }
}
