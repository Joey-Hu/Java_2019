package chapter5;

/**
 * @author: huhao
 * @time: 2019/7/28 8:10
 * @desc:
 */
public class TestSuper {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildrenClass...");
        new ChildrenClass();
        /*
        开始创建一个ChildrenClass...
        创建FatherClass
        创建ChildrenClass
         */
    }
}

class FatherClass {
    public FatherClass() {
        System.out.println("创建FatherClass");
    }
}

class ChildrenClass extends FatherClass {
    public ChildrenClass() {
        System.out.println("创建ChildrenClass");
    }
}