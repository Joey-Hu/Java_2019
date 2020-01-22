package practice.p5.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 15:29
 * @desc:
 */
public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk () {
        System.out.println("该动物有" + legs + "条腿," + " 该动物的行动方式为:走路。");
    }
}
