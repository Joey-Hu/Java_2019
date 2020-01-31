package Jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author: huhao
 * @time: 2019/9/14 20:10
 * @desc:
 */
public class JsoupDemo1 {
    public static void main(String[] args) {
        // 1.导入jar包
        // 2. 获取Document对象 根据xml文档获取
        // 2.1 获取student.xml的path
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        try {
            // 2.2 Jsoup.parse(file) 解析xml文档，加载文档进内存，获取dom树 -- Document
//            Document document = Jsoup.parse(new File(path), "utf-8");
            // 2.2_1 Jsoup.parse(url, timeoutMills )
            URL url = new URL("https://jsoup.org/download");
            Document document = Jsoup.parse(url, 10000);
            System.out.println(document);

          /*  // 3.获取元素对象    element
            Elements elements = document.getElementsByTag("name");
            // return 2
            System.out.println(elements.size());

            // 4.获取element对象
            Element element = elements.get(0);
            String name1 = element.text();
            System.out.println(name1);*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
