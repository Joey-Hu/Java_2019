package chapter5;
/**
 * @author: huhao
 * @time: 2019/7/28 10:18
 * @desc:
 */

/**
 * 飞行接口
 */
interface Volent {
    /**
     * 总是：public static final类型的；
     **/
    int FLY_HEIGHT = 100;

    /**
     * 总是：public abstract void fly()；
     */
    void fly();
}

/**
 * 善良接口
 */
interface Honest {
    void helpOther();
}

class Angel implements Volent, Honest {
    @Override
    public void fly() {
        System.out.println("I'm an Angel, I'm flying!");
    }

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路！");
    }
}

class GoodMan implements Honest {
    @Override
    public void helpOther() {
        System.out.println("拾金不昧！");
    }
}

class BigAngel extends Angel {
    @Override
    public void fly() {
        System.out.println("我是大天使！");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        BigAngel a1 = new BigAngel();
        a1.fly();

        Volent volent = new Angel();
        volent.fly();
        System.out.println(Volent.FLY_HEIGHT);

        Honest honest = new GoodMan();
        honest.helpOther();

        /*
         我是大天使！
         I'm an Angel, I'm flying!
         100
         拾金不昧！
         */
    }
}