package practice.P2;

/**
 * @author: huhao
 * @time: 2019/8/23 8:02
 * @desc:
 */
public class GoldenSectionRatio {
    public static void main(String[] args) {
        double diff = 0;
        double minDiff = 1;
        int A = 0;
        int B = 0;
        for (int num1 = 1; num1 < 21; num1++) {
            for (int num2 = 1; num2 < 21; num2++) {
                if (num1 % 2 == 0 & num2 % 2 == 0) {
                    continue;
                }else {
                    diff = Math.abs((double) num1 / num2 - 0.618);
                    if (diff < minDiff) {
                        minDiff = diff;
                        A = num1;
                        B = num2;
                    }
                }
            }
        }
        System.out.println("两数相除离黄金分割点（ 0.618）最近的是："+A+'/'+B);


    }
}
