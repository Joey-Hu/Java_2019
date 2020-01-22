package practice.p5.domain;

/**
 * @author: huhao
 * @time: 2019/8/24 15:40
 * @desc:
 */
public class Cat extends Animal implements Pet {
    private String name;

    public Cat(int legs, String name) {
        super(4);
        this.name = name;
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
    public String getName() {
    
        return name;
    }

/*    public Cat() {
        this("");
    }*/

    @Override
    public void eat() {
        System.out.println(name + " 在吃东西。");
    }
}
