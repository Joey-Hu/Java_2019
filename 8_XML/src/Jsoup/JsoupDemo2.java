package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author: huhao
 * @time: 2019/9/14 20:47
 * @desc: Document对象
 */
public class JsoupDemo2 {
    public static void main(String[] args) {
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();
        try {
            Document document = Jsoup.parse(new File(path), "utf-8");
            // 获取所有student元素对象
            Elements student = document.getElementsByTag("student");
            System.out.println(student);
            System.out.println("=======================");
            // 获取属性名为id的对象
            Elements id = document.getElementsByAttribute("id");
            System.out.println(id);
            System.out.println("=======================");
            // 获取属性number值为"s0001"的元素对象
            Elements elementsByAttributeValue = document.getElementsByAttributeValue("number", "s0001");
            System.out.println(elementsByAttributeValue);
            System.out.println("=======================");
            // 获取id值为1的元素对象
            Element elementById = document.getElementById("1");
            System.out.println(elementById);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
