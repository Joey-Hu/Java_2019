package reflect.domain;

import reflect.reflect.Person;

import java.lang.reflect.Constructor;

/**
 * @author: huhao
 * @time: 2019/8/9 15:54
 * @desc:
 */
public class ReflectDemo3 {
    /**
     * 获取构造方法们
     * Constructor<?>[]    getConstructors()
     * Constructor<T>    getConstructor(类<?>... parameterTypes)
     * <p>
     * Constructor<?>[]    getDeclaredConstructors()
     * Constructor<T>    getDeclaredConstructor(类<?>... parameterTypes)
     */

    public static void main(String[] args) throws Exception {
        // 0.获取Person的Class对象
        Class personClass = Person.class;

        // Constructor<T>    getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        /**
         * 返回 public cn.hh.reflect.Person(java.lang.String,int)
         */

        // 创建对象
        Object person = constructor.newInstance("张三", 18);
        System.out.println(person);
        /**
         * 返回Person{name='张三', age=18, a='null', b='null', c='null', d='null'}
         */

        System.out.println("--------------");
        // Constructor<T>    getConstructor(类<?>... parameterTypes)
        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        /**
         * 返回 public cn.hh.reflect.Person()
         * 可以简化
         */

        Object person1 = personClass.newInstance();
        System.out.println(person1);
        /**
         * 返回Person{name='null', age=0, a='null', b='null', c='null', d='null'}
         */

//        constructor.setAccessible(true);



    }
}
