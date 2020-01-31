package practice.P2;

/**
 * @author: huhao
 * @time: 2019/8/23 7:05
 * @desc:
 */
public class TestVariable {
    int i = 1;

    public void methodd1(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        new TestVariable().methodd1(5);
    }
}
