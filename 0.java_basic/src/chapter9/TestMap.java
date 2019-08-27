package chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huhao
 * @time: 2019/8/6 7:06
 * @desc:
 */
public class TestMap {
    public static void main(String[] args) {
        test1();

        /*
        3
        true
        false
        hashMap1:{1=aaa, 2=bbb, 3=ddd}
        hashMap2:{1=zhang, 2=li}
        hashMap3:{1=zhang, 2=li, 3=ddd}
         */
    }

    public static void test1() {
        Map<Integer,String> myHashMap1 = new HashMap<Integer, String>();
        Map<Integer,String> myHashMap2 = new HashMap<Integer, String>();
        myHashMap1.put(1, "aaa");
        myHashMap1.put(2, "bbb");
        myHashMap1.put(3, "ccc");
        myHashMap2.put(1, "zhang");
        myHashMap2.put(2, "li");
        System.out.println(myHashMap1.size());
        System.out.println(myHashMap1.containsKey(1));
        System.out.println(myHashMap2.containsValue("张"));
        // 键值重复，会替换旧的键值对
        myHashMap1.put(3, "ddd");

        Map<Integer, String> myHashMap3 = new HashMap<Integer, String>();
        // 键值对应替换
        myHashMap3.putAll(myHashMap1);
        myHashMap3.putAll(myHashMap2);
        System.out.println("myHashMap1:" + myHashMap1);
        System.out.println("myHashMap2:" + myHashMap2);
        System.out.println("myHashMap3:" + myHashMap3);
    }
}
