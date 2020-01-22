package reflect.reflect;

/**
 * @author: huhao
 * @time: 2019/8/9 7:41
 * @desc:
 */
public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;


    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "cn.hh.reflect.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("I'm eating...");
    }

    public void eat(String food) {
        System.out.println("I'm eating " + food + ".");
    }
}
