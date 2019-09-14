package util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

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
            person.addAttribute("id", "name");
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
            // 查看API
            Element ele = (Element)doc.selectSingleNode("//person[@id='" + name + "']");
            Element num1 = ele.element("num");
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
}
