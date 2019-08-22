package chapter7;

/**
 * @author: huhao
 * @time: 2019/7/29 6:55
 * @desc:
 */


class Man {
    private int age;
    private int id;

    public Man(int age, int id) {
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + "; age=" + this.age + "]";
    }
}


public class TestReferenceArray {
    public static void main(String[] args) {
        Man[] men = new Man[10];

        Man m1 = new Man(10,1);
        Man m2 = new Man(20,2);

        men[0] = m1;
        men[1] = m2;

        System.out.println(men[0]);
        System.out.println(men[1]);

    }
}
