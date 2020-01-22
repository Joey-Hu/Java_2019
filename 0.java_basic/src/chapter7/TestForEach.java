package chapter7;

/**
 * @author: huhao
 * @time: 2019/7/29 7:20
 * @desc:
 */
public class TestForEach {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        String[] str1 = {"北京", "上海", "广州", "深圳", "杭州"};
        String[] str2 = new String[6];

        for(int i = 0; i<a1.length; i++) {
            a1[i] = 2 * i + 1;
        }

        for(int temp : a1) {
            System.out.println(temp + "\t");
        }

        // 数组的拷贝
        System.arraycopy(str1, 0, str2, 0, 5);

        for(String temp : str2) {
            System.out.print(temp + "\t\t");
        }
    }
}
