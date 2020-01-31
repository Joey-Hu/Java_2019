package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 14:16
 * @desc:
 */
public class ADAPHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("This ADC&APC " + this.getName() + " is dead!");
    }
}
