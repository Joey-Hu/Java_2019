package chapter11;

/**
 * @author: huhao
 * @time: 2019/8/9 6:51
 * @desc: 通过Runnable接口实现多线程
 */

public class TestThread implements Runnable {
    int THREAD_NUM = 10;
    /**
     * run()里是线程体
     */
    @Override
    public void run() {
        for (int i=0; i<THREAD_NUM; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象，把实现了Runnable接口的对象作为参数传入；
        Thread thread1 = new Thread(new TestThread());
        thread1.start();
        Thread thread2 = new Thread(new TestThread());
        thread2.start();

    }

}
