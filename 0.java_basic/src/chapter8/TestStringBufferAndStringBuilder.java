package chapter8;

/**
 * @author: huhao
 * @time: 2019/7/30 15:54
 * @desc:
 */
public class TestStringBufferAndStringBuilder {
    public static void main(String[] args) {
        /**
         * StringBuilder
         */
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < 7; i++) {
            // 追加单个字符
            sb.append((char)('a' + i));
        }

        System.out.println(sb.toString());
        /*追加字符串*/
        sb.append(", Good Day!");
        System.out.println(sb.toString());

        /**
         * StringBuffer
         */
        StringBuffer sb2 = new StringBuffer("中华人民共和国");
        sb2.insert(0,"爱").insert(0, "我");

        System.out.println(sb2.toString());
        //删除子字符串
        sb2.delete(0, 2);
        System.out.println(sb2);
        //删除某个字符
        sb2.deleteCharAt(0).deleteCharAt(0);
        //获取某个字符
        System.out.println(sb2.charAt(0));
        //字符串逆序
        System.out.println(sb2.reverse());
    }
}
