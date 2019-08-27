package practice.p1;

import com.sun.javafx.runtime.SystemProperties;

/**
 * @author: huhao
 * @time: 2019/8/22 17:56
 * @desc:
 */
public class TestHero {
    public static void main (String[] args) {
        Hero garen = new Hero("盖伦", 616.28f, 27.536f, 350);
        Hero teemo = new Hero("提莫",383f, 14f, 330);

        garen.legendary();
        garen.getHp();
        garen.setHp(20);
        System.out.println(garen.getHp());
        garen.recovery(100);
        System.out.println(garen.getHp());

        /*System.out.println(garen);
        System.out.println(teemo);*/


    }
}
