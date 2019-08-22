package chapter5;

/**
 * @author: huhao
 * @time: 2019/7/15 13:31
 * @desc:
 */
class Inheritance {
    public static void main(String[] args) {
        Student stu = new Student("huhao", 175, "Geographic Information Science");
        stu.rest();
        stu.study();
        stu.output(stu);
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("take a rest...");
    }

    public void output(Person p){
        System.out.println("name is: " + p.name + "\n");
        System.out.println("height is: " + p.height + "\n");
    }
}

class Student extends Person {
    String major;

    public void study() {
        System.out.println("I'm learning Java!");
    }

    public void output(Student s) {
        System.out.println("\nname is: " + s.name + "\n");
        System.out.println("height is: " + s.height + "\n");
        System.out.println("my major is: " + s.major + "\n");

    }

    public Student(String name, int height, String major) {     //构造方法不能集成父类
        //天然拥有父类的属性
        this.name = name;
        this.height = height;
        this.major = major;
    }
}