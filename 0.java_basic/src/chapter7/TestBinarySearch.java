package chapter7;

import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/30 9:51
 * @desc:
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        // 二分查找之前先对数组进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("索引是：" + binarySearch(arr, 9));


    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == array[mid]) {
                return mid;
            }
            if (value > array[mid]) {
                low = mid + 1;
            }
            if (value < array[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
