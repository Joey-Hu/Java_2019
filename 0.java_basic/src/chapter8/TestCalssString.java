package chapter8;

/**
 * @author: huhao
 * @time: 2019/7/30 15:40
 * @desc:
 */
public class TestCalssString {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = new String("abcdef");
        String str3 = str1.substring(2,5);
        String str4 = str2.substring(2,5);

        System.out.println(Integer.toHexString(str1.hashCode()));
        System.out.println(Integer.toHexString(str2.hashCode()));
        System.out.println(Integer.toHexString(str3.hashCode()));
        System.out.println(Integer.toHexString(str4.hashCode()));


        /*
        b8197464
        ab199863
        18024
        18024
         */

    }
}
