package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: huhao
 * @time: 2019/8/8 7:20
 * @desc:
 */
public class TestFileCopy {
    public static void main(String[] args) {
        copyFile("D:\\Desktop\\Java\\java_basic\\src\\chapter10\\TestCopyFile_src.txt",
                "D:\\Desktop\\Java\\java_basic\\src\\chapter10\\TestCopyFile_dec.txt");
    }

    /**
     * 文件拷贝方法
     * @param src
     * @param dec
     */
    public static void copyFile(String src, String dec) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        // 为提高效率，设置缓存数组（读取的字节数会暂存放到该字节数组中）
        byte[] buffer = new byte[1024];
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //边读边写
            //temp指的是本次读取的真实长度，temp等于-1时表示读取结束
            while ((temp = fis.read(buffer)) != -1) {
                /**
                 * 将缓存数组中的元素写入文件中，注意，写入的是读取的真实长度；
                 * 如果使用fos.write(buffer)方法，那么写入到的长度将会是1024，
                 * 即缓存数组的长度
                 */
                fos.write(buffer, 0, temp);
            }

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
