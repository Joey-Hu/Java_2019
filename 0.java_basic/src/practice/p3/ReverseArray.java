package practice.p3;

/**
 * @author: huhao
 * @time: 2019/8/23 9:14
 * @desc:
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int temp = 0;
        int length = array1.length;
        for (int i = 0; i < length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

        for(int each : array1) {
            System.out.print(each + "\t");
        }

        for (int j = 0; j < length / 2; j++) {
            temp = array1[j];
            array1[j] = array1[length-j-1];
            array1[length-j-1] = temp;
        }
        System.out.println();

        for(int each : array1) {
            System.out.print(each + "\t");
        }


    }
}
