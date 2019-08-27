package chapter9;

import java.util.*;

/**
 * @author: huhao
 * @time: 2019/8/6 8:11
 * @desc:
 */
public class TestIterator {
    public static final int LIST_LENGTH = 5;
    public static final int SET_LENGTH = 16;

    public static void main(String[] args) {
        testList();
        testSet();
    }

    /**
     * 迭代器遍历list
     */
    public static void testList() {
        List<String> myList = new ArrayList<String>();

        for (int i = 0; i < LIST_LENGTH; i++) {
            myList.add("huhao" + i);
        }
        System.out.println(myList);

        for (Iterator<String> iter = myList.iterator(); iter.hasNext();) {
            String temp = iter.next();
            System.out.println(temp + "\t");
            // 删除3结尾的字符串
            if (temp.endsWith("3")) {
                iter.remove();
            }
        }

        System.out.println();
        System.out.println(myList);

        /*
        [huhao0, huhao1, huhao2, huhao3, huhao4]
        huhao0
        huhao1
        huhao2
        huhao3
        huhao4

        [huhao0, huhao1, huhao2, huhao4]
         */
    }

    /**
     * 迭代器遍历set
     */
    public static void testSet() {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < SET_LENGTH; i++) {
            set.add("a" + i);
        }
        System.out.println(set);
        for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
            String temp = iter.next();
            System.out.print(temp + "\t");
        }
        System.out.println();
        System.out.println(set);

        /*
        [a11, a10, a13, a12, a15, a14, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
        a11	a10	a13	a12	a15	a14	a0	a1	a2	a3	a4	a5	a6	a7	a8	a9
        [a11, a10, a13, a12, a15, a14, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]

         */
    }

    /**
     * 迭代器遍历map
     */
    public static void testMap1() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("A", "zhangsan");
        myMap.put("B", "lisi");
        Set<Map.Entry<String, String>> ss = myMap.entrySet();
        for (Iterator<Map.Entry<String, String>> iterator = ss.iterator(); iterator.hasNext();) {
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey() + "--" + e.getValue());
        }
    }
}
