package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/30 8:03
 * @desc:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2,1,30,8,5,6,4,3,4,23,3,2};
        bubbleSort(a);
    }

    public static void bubbleSort(int[] values) {
        boolean flag = false;
        int temp;

        for (int i = 0; i < values.length; i++) {
            flag = false;
            for (int j = 0; j < values.length-1-i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    flag = true;
                }
            }

            if (flag == false) {
                break;
            }

            System.out.format("第%d趟:\t", i+1);
            System.out.println(Arrays.toString(values));
        }
    }

    /*
    没加flag情况：
    第1趟:	[1, 2, 8, 5, 6, 4, 3, 4, 23, 3, 2, 30]
    第2趟:	[1, 2, 5, 6, 4, 3, 4, 8, 3, 2, 23, 30]
    第3趟:	[1, 2, 5, 4, 3, 4, 6, 3, 2, 8, 23, 30]
    第4趟:	[1, 2, 4, 3, 4, 5, 3, 2, 6, 8, 23, 30]
    第5趟:	[1, 2, 3, 4, 4, 3, 2, 5, 6, 8, 23, 30]
    第6趟:	[1, 2, 3, 4, 3, 2, 4, 5, 6, 8, 23, 30]
    第7趟:	[1, 2, 3, 3, 2, 4, 4, 5, 6, 8, 23, 30]
    第8趟:	[1, 2, 3, 2, 3, 4, 4, 5, 6, 8, 23, 30]
    第9趟:	[1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 23, 30]
    第10趟:	[1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 23, 30]
    第11趟:	[1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 23, 30]
    第12趟:	[1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 23, 30]

    加flag情况：
    第1趟:	[1, 2, 8, 5, 6, 4, 3, 4, 23, 3, 2, 30]
    第2趟:	[1, 2, 5, 6, 4, 3, 4, 8, 3, 2, 23, 30]
    第3趟:	[1, 2, 5, 4, 3, 4, 6, 3, 2, 8, 23, 30]
    第4趟:	[1, 2, 4, 3, 4, 5, 3, 2, 6, 8, 23, 30]
    第5趟:	[1, 2, 3, 4, 4, 3, 2, 5, 6, 8, 23, 30]
    第6趟:	[1, 2, 3, 4, 3, 2, 4, 5, 6, 8, 23, 30]
    第7趟:	[1, 2, 3, 3, 2, 4, 4, 5, 6, 8, 23, 30]
    第8趟:	[1, 2, 3, 2, 3, 4, 4, 5, 6, 8, 23, 30]
    第9趟:	[1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 23, 30]
     */
}


