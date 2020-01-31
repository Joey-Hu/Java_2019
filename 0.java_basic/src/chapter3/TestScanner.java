package chapter3;

import java.util.Scanner;

/**
 * @author: huhao
 * @time: 2019/7/11 14:14
 * @desc:
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        System.out.println("#############################");
        System.out.println("Your info is:");
        System.out.println("Name:" + name + "\nAge:" + age + "\nSalary:" + salary + "\n");

    }
}
