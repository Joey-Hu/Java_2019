package chapter7;

import java.io.PrintStream;

/**
 * @author: huhao
 * @time: 2019/7/30 10:10
 * @desc:
 */
public class Test1 {
    public static void main(String[] args) {
        String[] arr = {"huhao", "is", "a", "nice", "good", "handsome", "humorous", "man"};
        String value = "zha";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Yes!");
                break;
            } else {
                System.out.println("No!");
                break;
            }
        }
    }

}