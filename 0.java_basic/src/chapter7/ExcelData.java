package chapter7;

import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/30 7:40
 * @desc:
 */
public class ExcelData {
    public static void main(String[] args) {
        Object[] a1 = {1001, "高崎", 18, "讲师", "2006-2-14"};
        Object[] a2 = {1002, "张三", 20, "助教", "2007-10-20"};
        Object[] a3 = {1003, "李四", 30, "班主任", "2008-5-10"};

        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;
        System.out.println(Arrays.deepToString(emps));

    }
}
