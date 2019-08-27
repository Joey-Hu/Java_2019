package junit.test;

import junit.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: huhao
 * @time: 2019/8/7 18:05
 * @desc:
 */
public class CalculatorTest {
    /**
     * 初始化方法：
     * 用于资源申请，所有测试方法在之先前都会执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源方法：
     * 在所有测试方法执行完后，都会自动执行该方法，不光测试方法有没有报错
     */
    @After
    public void close() {
        System.out.println("close...");
    }
    /**
     * 测试Add方法
     */
    @Test
    public void testAdd() {
        Calculator cal  = new Calculator();

        System.out.println("testAdd...");
        int result = cal.add(1, 2);
//        System.out.println(result);
        Assert.assertEquals(3, result);
    }

    /**
     * 测试sub方法
     */
    @Test
    public void testSub() {
        Calculator cal  = new Calculator();

        System.out.println("testSub...");
        int result = cal.sub(2, 1);
        Assert.assertEquals(1, result);

    }
}
