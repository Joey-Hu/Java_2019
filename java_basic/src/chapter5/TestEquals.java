package chapter5;

/**
 * @author: huhao
 * @time: 2019/7/28 7:16
 * @desc:
 */
public class TestEquals {
    public static void main(String[] args) {
        Person2 p1 = new Person2(101,"huhao");
        Person2 p2 = new Person2(101,"张三");
        // false, 不是同一个对象
        System.out.println(p1 == p2);
        //true，在重写方法中认为id相同，则对象相同
        System.out.println(p1.equals(p2));
        String str1 = new String("huhao is a nice guy!");
        String str2 = new String("huhao is a nice guy!");
        // false,两个字符串不是同一个对象
        System.out.println(str1 == str2);
        // true，两个字符串内容相同
        System.out.println(str1.equals(str2));
    }
}


class Person2 {
    int id;
    String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else {
            if(obj instanceof Person2) {
                Person2 c = (Person2)obj;
                if(c.id == this.id){
                    return true;
                }
            }
        }
        return false;
    }
}