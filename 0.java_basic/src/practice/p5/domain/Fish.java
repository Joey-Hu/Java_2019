package practice.p5.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 15:46
 * @desc:
 */
public class Fish extends Animal implements Pet {
    private String name;

    public Fish(int legs, String name) {
        super(0);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }


    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void walk () {
        System.out.println("该动物有" + legs + "条腿," + " 该动物不能行走。");
    }
}
