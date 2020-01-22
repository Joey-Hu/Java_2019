package chapter5;

import javafx.print.PrinterAttributes;

/**
 * @author: huhao
 * @time: 2019/7/28 8:59
 * @desc:
 */

class Person3 {
    private String name;
    private int age;

    public Person3() {

    }

    public Person3(String name, int age) {
        this.name = name;
        // 构造方法中一般采用直接赋值，外部一般使用set方法
        this.age = age;
        // setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 赋值之前先判断年龄是否合法
        if(age > 130 || age < 0) {
            // 不合法赋值默认18
            this.age = 18;
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}


public class TestEncapsulation {
    public static void main(String[] args) {
        Person3 p1 = new Person3();
        /*编译错误：
        p1.name = "张三";
        p1.age = 16;*/

        p1.setName("张三");
        p1.setAge(16);
        System.out.println(p1);

        Person3 p2 = new Person3("李四",20);
        System.out.println(p2);


    }

}
