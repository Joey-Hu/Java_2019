package chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: huhao
 * @time: 2019/8/5 7:09
 * @desc:
 */
public class TestList {
    public static void main(String[] args) {
        test3();
    }

    /**
     * 测试add/remove/size/isEmpty/contains/clear/toArrays等方法
     */
    public static void test1() {
        List<String> list = new ArrayList<String>();
        System.out.println(list.isEmpty());
        list.add("aaa");
        System.out.println(list.isEmpty());
        list.add("bbb");
        System.out.println(list);
        System.out.println("list的大小：" + list.size());
        System.out.println("是否包含指定元素：" + list.contains("aaa"));
        list.remove("bbb");
        System.out.println(list);
        Object[] obj = list.toArray();
        System.out.println("转化成object数组：" + Arrays.toString(obj));
        list.clear();
        System.out.println("清空所有元素：" + list);

        /*
        输出结果：
        true
        false
        [aaa, bbb]
        list的大小：2
        是否包含指定元素：true
        [aaa]
        转化成object数组：[aaa]
        清空所有元素：[]
         */
    }

    /**
     * 测试两个容器间的元素处理
     */
    public static void test2() {
        List<String> list1 = new ArrayList<String>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        List<String> list2 = new ArrayList<String>();
        list2.add("zhangsan");
        list2.add("lisi");
        list2.add("aaa");

        // list1中是否包含list2中所有元素
        System.out.println(list1.containsAll(list2));
        System.out.println(list1);

        // 把所有list2中的元素加到list1中
        list1.addAll(list2);
        System.out.println(list1);

        // 在list1中删除存在于list2中存在的元素
        list1.removeAll(list2);
        System.out.println(list1);

        // 取两个list之间的交集
        list1.retainAll(list2);
        System.out.println(list1);

        /*
        输出结果：
        false
        [aaa, bbb, ccc]
        [aaa, bbb, ccc, zhangsan, lisi, aaa]
        [bbb, ccc]
        []

         */
    }

    /**
     *测试List中关于索引操作的方法
     */
    public static void test3() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.add(2, "Hu");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2, "c");
        System.out.println(list);
        System.out.println(list.get(1));
        list.add("B");
        System.out.println(list);
        // 从头到尾找到第一个"B"
        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));

        /*
        输出结果：
        [A, B, C, D]
        [A, B, Hu, C, D]
        [A, B, C, D]
        [A, B, c, D]
        B
        [A, B, c, D, B]
        1
        4
         */
    }
}
