package chapter7;

import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/29 7:39
 * @desc:
 */
public class TestClassArray {
    public static void main(String[] args) {
        /**
         *  打印数组
         */
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(a);
        // 此处的Arrays.toString()方法是Array类的静态方法，不是前面讲的Object的toString方法
        System.out.println(Arrays.toString(a));

        /**
         * 数组元素排序
         */
        int[] a2 = {2, 4, 1, 3, 7, 5, 6, 4};

        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

        /**
         * 数组元素是引用类型的排序（Comparable接口的应用）
         */

    }
}
