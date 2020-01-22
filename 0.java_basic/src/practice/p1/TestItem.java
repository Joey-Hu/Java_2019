package practice.p1;

/**
 * @author: huhao
 * @time: 2019/8/22 18:21
 * @desc:
 */
public class TestItem {
    public static void main(String[] args) {
        Item bloodBottle = new Item("血瓶", 50);
        Item shoes = new Item("草鞋", 300);
        Item sword = new Item();
        sword.setName("长剑");
        sword.setPrice(350);

        System.out.println(bloodBottle);
        System.out.println(shoes);
        System.out.println(sword);

    }

}
