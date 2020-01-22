package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 14:12
 * @desc:
 */
public class ADHero extends Hero implements Mortal{

    @Override
    public void die() {
        System.out.println("ADC " + this.getName() + " 死亡！");
    }
}
