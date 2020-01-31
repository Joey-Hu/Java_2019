package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 14:18
 * @desc:
 */
public class TestHero {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.setName("盖伦");

        ADHero bountyHunter = new ADHero();
        bountyHunter.setName("赏金");

        APHero fa = new APHero();
        fa.setName("小法");

        ADAPHero ez = new ADAPHero();
        ez.setName("EZ");

        garen.kill(bountyHunter);
        garen.kill(fa);
        garen.kill(ez);

    }
}
