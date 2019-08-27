/**
 * @author: huhao
 * @time: 2019/7/7 8:21
 * @desc: 循环
 */
public class TestCirculatiom {
    public static void main(String[] args) {
        /*
        //while
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);

        //do-while
        do {
            sum += i;
            i++;
        } while (i <= 100);     //此处的；不能省略
        System.out.println("sum = " + sum);


        //for循环

        int sum = 0;
        for(int i=1; i<=100;i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        for(int j=9; j>0;j--){
            System.out.print(j+"、");
        }
        System.out.println();

        for(int k=90;k>0;k=k-3){
            System.out.print(k+"、");
        }
        System.out.println();
        */


        //嵌套循环 九九乘法表

        for(int i=1; i<=9; i++){
            for(int j=1;j<=i; j++){
//                System.out.print(j + "*" + i + "=" + i*j + " ");
                /*
                1*1=1
                1*2=2 2*2=4
                1*3=3 2*3=6 3*3=9
                1*4=4 2*4=8 3*4=12 4*4=16
                1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
                1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
                1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
                1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
                1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
                 */
                System.out.print(j + "*" + i + "=" + (i*j<10?(" " + i*j):i*j) + " ");
                /*1*1= 1
                1*2= 2 2*2= 4
                1*3= 3 2*3= 6 3*3= 9
                1*4= 4 2*4= 8 3*4=12 4*4=16
                1*5= 5 2*5=10 3*5=15 4*5=20 5*5=25
                1*6= 6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
                1*7= 7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
                1*8= 8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
                1*9= 9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81*/
            }
            System.out.println();
        }
    }
}
