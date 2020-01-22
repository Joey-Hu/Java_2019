package chapter4;

/**
 * @author: huhao
 * @time: 2019/7/12 17:01
 * @desc:
 */

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name) {
        this.id = id;       //this表示创建好的对象
        this.name = name;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public User() {

    }
}

public class TestConstructor_2 {
    public static void main(String[] args) {
        User user1 = new User(1001, "zhangsan");
        User user2 = new User(1002, "lisi", "123456");
        User user3 = new User();
        System.out.println("##########################");
        System.out.println(user1.id + "\t" + user1.name + "\t" + user1.pwd + "\n");
        System.out.println(user2.id + "\t" + user2.name + "\t" + user2.pwd + "\n");
        System.out.println(user3.id + "\t" + user3.name + "\t" + user3.pwd + "\n");

    }
}


/*
##########################
        1001	zhangsan	null

        1002	lisi	123456

        0	null	null
*/
