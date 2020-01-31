package practice.p4.domain;

/**
 * @author: huhao
 * @time: 2019/8/23 10:25
 * @desc:
 */
public class Hero {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    private String name;
    private double hp;
    private double armor;
    private int moveSpeed;

    public Hero() {
    }

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

    public void kill (Mortal m) {
        m.die();
    }
}
