package chapter7;

import java.util.Arrays;

/**
 * @author: huhao
 * @time: 2019/7/30 6:59
 * @desc:
 */


class Human implements Comparable {
    int age;
    int id;
    String name;

    public Human(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Human man = (Human) o;
        if(this.age < man.age) {
            return -1;
        }
        if(this.age > man.age) {
            return 1;
        }
        return 0;
    }
}

public class TestClassArrays2 {
    public static void main(String[] args) {
        Human[] msMen = {new Human(3,"a"), new Human(60,"b"), new Human(2,"c")};
        Arrays.sort(msMen);
        System.out.println(Arrays.toString(msMen));
    }
}
