/*
package Tel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;



    //添加联系人
    public void addNum(String name,String num) throws DocumentException, IOException{
        //创建解析器对象
        SAXReader reader =new SAXReader();
        Document doc = reader.read(new FileInputStream("contact.xml"));
        //获取根标签
        Element roele = doc.getRootElement();
        //添加子标签
        Element p = roele.addElement("person");
        p.addAttribute("id", name);
        Element na = p.addElement("name");
        na.addText(name);
        Element number = p.addElement("num");
        number.addText(num);
        System.out.println("添加成功");
        //写入文件
        OutputFormat prettyPrint =OutputFormat.createPrettyPrint();
        XMLWriter w=new XMLWriter(new FileOutputStream("contact.xml"),prettyPrint);
        w.write(doc);
        w.close();
    }


    //编辑联系人
    public void setNum(String name,String num) throws DocumentException, IOException{
        SAXReader reader=new SAXReader();
        Document doc=reader.read(new FileInputStream("contact.xml"));
        //找到指定person子标签
        Element ele = (Element)doc.selectSingleNode("//person[@id='"+name+"']");
        Element number =ele.element("num");
        number.setText(num);
        System.out.println("修改成功");
        //写入文件
        OutputFormat prettyPrint =OutputFormat.createPrettyPrint();
        XMLWriter w=new XMLWriter(new FileOutputStream("contact.xml"),prettyPrint);
        w.write(doc);
        w.close();
    }


    //删除联系人
    public void delNum(String name) throws DocumentException, IOException{
        SAXReader reader=new SAXReader();
        Document doc=reader.read(new FileInputStream("contact.xml"));
        //找到指定person子标签
        Element ele = (Element)doc.selectSingleNode("//person[@id='"+name+"']");
        //删除
        ele.detach();
        System.out.println("删除成功");
        //写入文件
        OutputFormat prettyPrint =OutputFormat.createPrettyPrint();
        XMLWriter w=new XMLWriter(new FileOutputStream("contact.xml"),prettyPrint);
        w.write(doc);
        w.close();
    }


    //查询所有联系人
    public void queryAll() throws IOException, DocumentException{
        SAXReader reader=new SAXReader();
        Document doc=reader.read(new FileInputStream("contact.xml"));
        //通过迭代器获取所有子标签
        Iterator<Element> iterator = doc.getRootElement().elementIterator("person");
        while(iterator.hasNext()){
            Element next = iterator.next();
            String name = next.element("name").getText();
            String num = next.element("num").getText();
            System.out.println("姓名:"+name+"--"+"电话:"+num);
        }

    }

}


package Tel;

        import java.io.IOException;
        import java.util.Scanner;

        import org.dom4j.DocumentException;

public class TelDemo {
    public static void main(String[] args) throws DocumentException, IOException {
        while(true){
            System.out.println("欢迎使用通讯录,请输入相应数字选择功能:");
            System.out.println("1.添加联系人");
            System.out.println("2.编辑联系人");
            System.out.println("3.删除联系人");
            System.out.println("4.查找联系人");

            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();

            //创建工具类对象
            TelTool tt=new TelTool();

            switch(i){
                case 1:
                    System.out.println("请输入联系人姓名");
                    String name=sc.next();
                    System.out.println("请输入电话号码");
                    String num=sc.next();
                    tt.addNum(name, num);
                    break;
                case 2:
                    System.out.println("请输入要修改的联系人姓名");
                    String name2=sc.next();
                    System.out.println("请输入要修改的电话号码");
                    String num2=sc.next();
                    tt.setNum(name2, num2);
                    break;
                case 3:
                    System.out.println("请输入要删除的联系人姓名");
                    String name3=sc.next();
                    tt.delNum(name3);
                    break;
                case 4:
                    System.out.println("查询结果如下:");
                    tt.queryAll();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }

}
——————————*/
