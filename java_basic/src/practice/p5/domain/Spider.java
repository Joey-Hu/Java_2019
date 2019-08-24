package practice.p5.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 15:34
 * @desc:
 */
public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eatint something.");
    }
}
