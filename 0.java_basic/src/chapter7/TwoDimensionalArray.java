package chapter7;

import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/30 7:20
 * @desc:
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 二维数组的声明
        int[][] a1 = new int[3][];
        a1[0] = new int[2];
        a1[1] = new int[4];
        a1[2] = new int[3];

        // 二维数组的静态初始化
        int[][] a2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        // 多维数组打印（不使用循环）
        System.out.println(Arrays.deepToString(a2));

        // 二维数组动态初始化
        int[][] a3 = new int[3][];
//        错误，没有声明类型就初始化
//        a3[0] = {1,2,5};
        a3[0] = new int[]{1, 2};
        a3[1] = new int[]{2, 2};
        a3[2] = new int[]{2, 2, 3, 4};
        System.out.println(a3[2][3]);
        System.out.println(Arrays.toString(a3[0]));
        System.out.println(Arrays.toString(a3[1]));
        System.out.println(Arrays.toString(a3[2]));

        // 获取数组长度
        System.out.println(a3.length);
        System.out.println(a3[2].length);
        
        
        /*
        [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
        4
        [1, 2]
        [2, 2]
        [2, 2, 3, 4]
        3
        4
         */
    }
}
