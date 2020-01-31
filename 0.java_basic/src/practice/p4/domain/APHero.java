package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 14:14
 * @desc:
 */
public class APHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("APC " + this.getName() + " DIE!");
    }
}
