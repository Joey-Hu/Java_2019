package chapter5;

/**
 * @author: huhao
 * @time: 2019/7/18 20:17
 * @desc:
 */
public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Horse();
        Vehicle v3 = new Plane();

        v1.run();
        v2.run();
        v3.run();
        v1.stop();
        v2.stop();
        v3.stop();

    }
}

class Vehicle {     //交通工具类

    public void run() {
        System.out.println(" 跑");
    }

    public void stop() {
        System.out.println("停止不动");
    }
}

class Horse extends Vehicle {

    @Override
    public void run() {     // 重写父类方法
        System.out.println("四蹄翻飞，嘚嘚嘚...");
    }
}

class Plane extends Vehicle {

    @Override
    public void run() {
        System.out.println("天上飞");
    }

    @Override
    public void stop() {
        System.out.println("空中不能停！");
    }
}
