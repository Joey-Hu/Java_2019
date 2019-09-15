package util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.Iterator;

/**
 * @author: huhao
 * @time: 2019/9/14 21:24
 * @desc:
 */
public class TelTool {
    // 添加联系人
    public void addNum(String name, String num) {
        // 创建解析器对象
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read(new FileInputStream("contact.xml"));
            // 获取根标签
            Element rootElement = doc.getRootElement();
            // 添加子标签
            Element person = rootElement.addElement("person");
            person.addAttribute("id", name);
            Element nam = person.addElement("name");
            nam.addText(name);
            Element nu = person.addElement("num");
            nu.addText(num);
            System.out.println("添加成功");

            //写入文件
            OutputFormat prettyPrint = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("contact.xml"), prettyPrint);
            xmlWriter.write(doc);
            xmlWriter.close();


        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 编辑联系人
    public void setNum(String name, String num) {
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read(new FileInputStream("contact.xml"));
            // 找到指定的person标签
            // 查看API    nodeObject.selectSingleNode(xpath)
            Element ele = (Element)doc.selectSingleNode("//person[@id='" + name + "']");
            /*
            Element num1 = ele.element("num");
            有错 原因上面的ele元素为null
            为什么为空？因为在上面的addNum函数中的语句person.addAttribute("id", name);写成了
            person.addAttribute("id", "name"); 导致所有的person结点的id属性值都为"name"
            所以导致Element ele = (Element)doc.selectSingleNode("//person[@id='" + name + "']");
            查找时找不到
            */
            Element num1 = ele.element("num");
            System.out.println("123");
            num1.setText(num);
            System.out.println("修改成功");

            //写入文件
            OutputFormat prettyPrint = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("contact.xml"), prettyPrint);
            xmlWriter.write(doc);
            xmlWriter.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 删除联系人
    public void delNum(String name) {
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read(new FileInputStream("contact.xml"));
            Element ele = (Element) doc.selectSingleNode("//person[@id='" + name + "']");
            // 删除
            ele.detach();
            System.out.println("删除成功");

            //写入文件
            OutputFormat prettyPrint = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("contact.xml"), prettyPrint);
            xmlWriter.write(doc);
            xmlWriter.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询所有联系人
    public void queryAll() {
        SAXReader saxReader = new SAXReader();
        try {
            Document doc = saxReader.read(new FileInputStream("contact.xml"));
            Iterator<Element> iterator = doc.getRootElement().elementIterator("person");
            while(iterator.hasNext()) {
                Element next = iterator.next();
                String name = next.element("name").getText();
                String num = next.element("num").getText();
                System.out.println("姓名: " + name+ "--" + "电话" + num);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
