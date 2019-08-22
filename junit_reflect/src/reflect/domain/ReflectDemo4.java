package reflect.domain;

import reflect.reflect.Person;

import java.lang.reflect.Method;

/**
 * @author: huhao
 * @time: 2019/8/9 15:54
 * @desc:
 */
public class ReflectDemo4 {
    /**
     * 获取成员方法们
     Method[]    getMethods()
     Method    getMethod(String name, 类<?>... parameterTypes)

     Method[]    getDeclaredMethods()
     Method    getDeclaredMethod(String name, 类<?>... parameterTypes)
     */

    public static void main(String[] args) throws Exception {
        // 0.获取Person的Class对象
        Class personClass = Person.class;

        // Method[]    getMethods()
        Method eat_method = personClass.getMethod("eat");
        // 执行方法（空参）
        Person p = new Person();
        eat_method.invoke(p);
        /**
         *返回I'm eating...
         */

        // Method[]    getMethods()
        Method eat_method2 = personClass.getMethod("eat", String.class);
        // 执行方法（有参）
        eat_method2.invoke(p, "蛋糕");
        /**
         * 返回I'm eating 蛋糕.
         */

        System.out.println("------------");
        // 获取所有public修饰的methods
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }

        /**
         返回
         public java.lang.String cn.hh.reflect.Person.toString()
         toString
         public java.lang.String cn.hh.reflect.Person.getName()
         getName
         public void cn.hh.reflect.Person.setName(java.lang.String)
         setName
         public int cn.hh.reflect.Person.getAge()
         getAge
         public void cn.hh.reflect.Person.eat(java.lang.String)
         eat
         public void cn.hh.reflect.Person.eat()
         eat
         public void cn.hh.reflect.Person.setAge(int)
         setAge
         public final void java.lang.Object.wait() throws java.lang.InterruptedException
         wait
         public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
         wait
         public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
         wait
         public boolean java.lang.Object.equals(java.lang.Object)
         equals
         public native int java.lang.Object.hashCode()
         hashCode
         public final native java.lang.Class java.lang.Object.getClass()
         getClass
         public final native void java.lang.Object.notify()
         notify
         public final native void java.lang.Object.notifyAll()
         notifyAll
         */

        // eat_method.setAccessible(true);
        
        // 获取类名
        String className = personClass.getName();
        System.out.println(className);
        /**
         * 返回Person

         */
    }
}
