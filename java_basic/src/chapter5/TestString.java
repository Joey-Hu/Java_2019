package chapter5;

/**
 * @author: huhao
 * @time: 2019/7/28 13:16
 * @desc:
 */


public class TestString {
    public static void main(String[] args) {
        String str1 = "rock star";
        String str2 = "rock star";
        String str3 = new String("rock star");
        String str4 = "Rock Star";

        // 返回下标为3的字符
        System.out.println(str1.charAt(3));
        // 返回字符串长度
        System.out.println(str1.length());
        // 比较两字符串是否相等, true
        System.out.println(str1.equals(str2));
        // false, 大小写不同
        System.out.println(str1.equals(str4));
        // true, 忽略大小写比较
        System.out.println(str1.equalsIgnoreCase(str4));
        // false, str1和str3是两个对象
        System.out.println(str1 == str3);
        // true, str1和str2内容相同
        System.out.println(str1 == str2);
        // 字符串s1中是否包含"star", return 5
        System.out.println(str1.indexOf("star"));
        // return -1
        System.out.println(str1.indexOf("pop"));
        // 将字符串中的空格替换成&, return rock&star
        String str5 = str1.replace(" ", "&");
        System.out.println(str5);

    }
}
