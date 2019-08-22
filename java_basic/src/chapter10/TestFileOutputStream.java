package chapter10;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: huhao
 * @time: 2019/8/7 17:04
 * @desc:
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        String str = "活学活用博弈论";
        try {
            
            fos = new FileOutputStream("D:\\Desktop\\Java\\java_basic\\src\\chapter10\\testFileOutputStream.txt");
            fos.write(str.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            // 为了保证出现异常后流的正常关闭，通常要将流的关闭语句要放到finally语句块中，并且要判断流是不是null。
        } finally {
            try {
                // 这种写法，保证了即使遇到异常情况，也会关闭流对象。
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
