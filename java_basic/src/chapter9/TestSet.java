package chapter9;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: huhao
 * @time: 2019/8/6 7:36
 * @desc:
 */
public class TestSet {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("hello");
        mySet1.add("world");
        System.out.println(mySet1);
        // 相同的元素不会被加入
        mySet1.add("hello");
        System.out.println(mySet1);
        mySet1.add(null);
        System.out.println(mySet1);
        mySet1.add(null);
        System.out.println(mySet1);
    }
}
