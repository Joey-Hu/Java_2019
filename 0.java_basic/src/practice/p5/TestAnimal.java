package practice.p5;

import practice.p5.domain.Cat;
import practice.p5.domain.Fish;
import practice.p5.domain.Spider;

/**
 * @author: huhao
 * @time: 2019/8/24 15:52
 * @desc:
 */
public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat(4, "猫");

        cat.walk();
        cat.play();
        cat.eat();

        Fish fish = new Fish(0, "鱼");

        fish.walk();
        fish.play();
        fish.eat();

        Spider spider = new Spider();

        spider.walk();
        spider.eat();
    }
}
