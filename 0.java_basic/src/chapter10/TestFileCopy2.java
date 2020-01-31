package chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: huhao
 * @time: 2019/8/8 8:00
 * @desc:
 */
public class TestFileCopy2 {
    public static void main(String[] args) {
        copyFile2("D:\\Desktop\\Java\\java_basic\\src\\chapter10\\TestCopyFile_src2.txt",
                "D:\\Desktop\\Java\\java_basic\\src\\chapter10\\TestCopyFile_dec2.txt");
    }

    /**
     * 文件复制（字符流）
     * @param src
     * @param dec
     */
    public static void copyFile2(String src, String dec) {
        FileReader fr = null;
        FileWriter fw = null;
        int len = 0;
        char[] buffer = new char[1024];

        try {
            fr = new FileReader(src);
            fw = new FileWriter(dec);

            while ((len = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
