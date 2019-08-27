package chapter3;

/**
 * @author: huhao
 * @time: 2019/7/6 18:04
 * @desc: if-else结构
 */
public class TestIfElse {
    public static void main(String[] args) {
        //随机产生一个[0.0, 4.0)区间的半径，并根据半径求圆的面积和周长
        double radius = Math.random();
        //Math.pow(r,2)求半径平方
        double area = Math.pow(radius, 2) * Math.PI;
        double circle = 2 * Math.PI * radius;
        System.out.println("半径为：" + radius);
        System.out.println("面积为：" + area);
        System.out.println("周长为：" + circle);

        if (area > circle) {
            System.out.println("面积大于周长");
        } else {
            System.out.println("周长大于面积");
        }


        //条件运算符 ： ？：
        int a = 2;
        int b = 3;
        System.out.println((a > b) ? a : b);


        //if-else if-else if- else
        int age = (int) (Math.random() * 100);
        System.out.println("年龄是" + age + "属于");

        if(age < 15){
            System.out.println("儿童，喜欢玩！");
        }else if(age < 25){
            System.out.println("青年，要学习！");
        }else if(age < 45){
            System.out.println("中年，要工作！");
        }else if(age < 65){
            System.out.println("中老年，要补钙！");
        }else if(age < 85){
            System.out.println("老年，多运动！");
        }else{
            System.out.println("老寿星，古来稀！");
        }


        //switch结构
        char c = 'a';
        int rand = (int) (Math.random()*26);
        char c2 = (char)(c + rand);
        System.out.println(c2 + ": ");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}
