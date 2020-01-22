package junit.junit;

/**
 * @author: huhao
 * @time: 2019/8/7 17:48
 * @desc:
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        /*int result = cal.add(1, 2);
        System.out.println(result);*/

        int result = cal.sub(3, 1);
        System.out.println(result);
    }
}
