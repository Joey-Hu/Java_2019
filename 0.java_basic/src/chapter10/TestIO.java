package chapter10;

import java.io.*;

/**
 * @author: huhao
 * @time: 2019/8/7 7:55
 * @desc:
 */
public class TestIO {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建输入流
            // 文件内容是：abc
            fis = new FileInputStream("D:\\Desktop\\Java\\java_basic\\src\\chapter10\\IOtest.txt");
            // 可变字符串
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            // 在实际开发中通常我们根本不知道文件的内容，因此我们在读取的时候需要配合while循环使用
            // 当temp等于-1时，表示已经到了文件结尾，停止读取
            while ((temp = fis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
            // 为了保证出现异常后流的正常关闭，通常要将流的关闭语句要放到finally语句块中，并且要判断流是不是null。
        } finally {
            try {
                // 这种写法，保证了即使遇到异常情况，也会关闭流对象。
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
