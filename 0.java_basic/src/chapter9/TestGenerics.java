package chapter9;

/**
 * @author: huhao
 * @time: 2019/8/5 6:48
 * @desc:
 */
public class TestGenerics {
    public static void main(String[] args) {
        // 这里的String就是实际传入数据的类型
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("aaa", 0);
        mc.set("bbb", 1);

        //加了泛型，直接返回String类型，不用强制转换
        String str = mc.get(0);
        System.out.println(str);
    }
}

/**
 * E表示泛型*/
class MyCollection<E> {
    Object[] objs = new Object[5];

    public E get(int index) {
        return (E) objs[index];
    }

    public void set(E e, int index) {
        objs[index] = e;
    }
}