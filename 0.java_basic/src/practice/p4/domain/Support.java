package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 13:47
 * @desc:
 */
public class Support extends Hero implements Healer{

    @Override
    public void heal() {
        System.out.println("进行辅助治疗");
    }

    public static void main(String[] args) {
        Support sup = new Support();
        sup.setName("奶妈");
        sup.setHp(300.3);
        sup.setArmor(33.3);
        sup.setMoveSpeed(10);
        System.out.println(sup);
        sup.heal();
        System.out.println(sup instanceof Hero);
        System.out.println(sup instanceof Support);
    }
}
