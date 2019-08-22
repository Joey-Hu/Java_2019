package reflect.domain;

import reflect.reflect.Person;

import java.lang.reflect.Field;

/**
 * @author: huhao
 * @time: 2019/8/9 15:15
 * @desc:
 */
public class ReflectDemo2 {
    /**
     获取成员变量们
     Field[]    getFields()：获取所有public修饰的成员变量
     Field    getField(String name)：获取指定名称的public修饰的成员变量

     Field[]    getDeclaredFields()：获取所有的成员变量，不考虑修饰符
     Field    getDeclaredField(String name)
     */


    public static void main(String[] args) throws Exception {

        // 0.获取Person的Class对象
        Class personClass = Person.class;

        // 1. 获取成员变量
        // Field[]    getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            /**
             * 返回 public java.lang.String cn.hh.reflect.Person.a
             */
        }


        System.out.println("--------------------");
        // Field    getField(String name)
        Field a = personClass.getField("a");
        // 获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        /**
         * 返回null
         */

        // 设置成员变量a的值
        a.set(p, "张三");
        System.out.println(p);
        /**
         * 返回Person{name='null', age=0, a='张三', b='null', c='null', d='null'}
         */

        System.out.println("--------------------");
        // Field[]    getDeclaredFields()
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
            /**
             private java.lang.String cn.hh.reflect.Person.name
             private int cn.hh.reflect.Person.age
             public java.lang.String cn.hh.reflect.Person.a
             protected java.lang.String cn.hh.reflect.Person.b
             java.lang.String cn.hh.reflect.Person.c
             private java.lang.String cn.hh.reflect.Person.d
             */
        }

        // Field    getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查
        // 暴力反射
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
        /**
         * 返回null
         */





    }
}
