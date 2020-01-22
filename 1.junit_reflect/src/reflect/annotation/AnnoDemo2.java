package reflect.annotation;

/**
 * JDK中预定义的一些注解
 * 1.@Override：检测被改注解标注的方法是否继承自父类（接口）的
   2.@Deprecated：该注解标注的内容，已过时
   3.@SuppressWarnings：压制警告
 */
@SuppressWarnings("all")
public class AnnoDemo2 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
     public void show1() {
        // 有缺陷
     }

     public void show2() {
        // 代替show1方法
     }

     public void demo() {
        // 被弃用的方法被使用时有横线划掉
        show1();
     }
}
