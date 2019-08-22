package chapter3;

/**
 * @author: huhao
 * @time: 2019/7/6 17:36
 * @desc: if单选择结构
 */
public class TestIf {
    public static void main(String[] args) {
        //double d = Math.random();   //产生[0,1)的随机数
        //扔三个骰子看看今天手气如何？
        int i = (int) (6 * Math.random()) + 1;
        int j = (int) (6 * Math.random()) + 1;
        int k = (int) (6 * Math.random()) + 1;

        int count = i + j + k;
        //如果三个骰子纸盒大于15，则手气不错
        if (count > 15) {
            System.out.println("今天手气不错！");
        }
        //如果10<count<=15，则手气一般
        if (count > 10 && count <= 15) {
            System.out.println("今天手气一般！");
        }
        //如果1count<=10，则手气不怎么样
        if (count <= 10){
            System.out.println("今天手气不怎么样！");
        }

        System.out.println("得了" + count + "分");
    }
}
