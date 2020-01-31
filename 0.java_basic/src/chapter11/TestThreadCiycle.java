package chapter11;

/**
 * @author: huhao
 * @time: 2019/8/9 7:02
 * @desc:
 */
public class TestThreadCiycle implements Runnable {
    String name;
    // 标记变量，表示线程是否可中止；
    boolean live = true;

    public TestThreadCiycle(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        //当live的值是true时，继续线程体；false则结束循环，继而终止线程体；
        while (live) {
            System.out.println(name + (i++));
        }
    }
    public void terminate() {
        live = false;
    }

    public static void main(String[] args) {
        TestThreadCiycle ttc = new TestThreadCiycle("线程A:");
        // 新生状态
        Thread t1 = new Thread(ttc);
        t1.start();// 就绪状态
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
        ttc.terminate();
        System.out.println("ttc stop!");
    }

}
