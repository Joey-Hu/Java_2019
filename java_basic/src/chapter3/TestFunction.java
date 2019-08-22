package chapter3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author: huhao
 * @time: 2019/7/7 9:54
 * @desc:
 *
 *
 *  1. 实参的数目、数据类型和次序必须和所调用的方法声明的形式参数列表匹配。

    2. return 语句终止方法的运行并指定要返回的数据。

    3. Java中进行方法调用中传递参数时，遵循值传递的原则(传递的都是数据的副本)：

    4. 基本类型传递的是该数据值的copy值。

    5. 引用类型传递的是该对象引用的copy值，但指向的是同一个对象。


    方法重载类型：

    方法名相同，参数个数不同

    方法名相同，参数类型不同

    方法名相同，参数顺序不同
        - int add(int n1, int n2)  ---->  double add(int n1, double n2)  构成重载
        - int add(int n1, int n2)  ---->  double add(int n1, int n2)     不构成重载
 */
public class TestFunction {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        String str = "Huhao is a nice man!";
        //调用求和的方法：将num1与num2的值传给add方法中的n1与n2
        // 求完和后将结果返回，用sum接收结果
        int sum = add(num1,num2);
        System.out.println("sum = " + sum);
        printstrint(str);
    }

    public static int add(int n1, int n2){
        return n1 + n2;
    }

    public static void printstrint(String str){
        System.out.println(str);
    }
}
