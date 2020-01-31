package practice.p3.domain;

/**
 * @author: huhao
 * @time: 2019/8/23 10:25
 * @desc:
 */
public class Hero {
    private String name;
    private double hp;
    private double armor;
    private int moveSpeed;

    public Hero(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, double hp, double armor, int moveSpeed) {
        this(name, hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }
}
