package chapter7;

/**
 * @author: huhao
 * @time: 2019/7/29 6:47
 * @desc:
 */
public class TestArray {
    public static void main(String[] args) {
        // 声明变量
        int [] s = null;
        // 给数组分配空间
        s = new int[10];
        for(int i = 0; i<10; i++) {
            s[i] = 2 * i + 1;
            System.out.print(s[i] + "\t");
        }
    }
}
