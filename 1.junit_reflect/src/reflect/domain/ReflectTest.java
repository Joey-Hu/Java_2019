package reflect.domain;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: huhao
 * @time: 2019/8/9 16:54
 * @desc:
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 写一个“框架”，在不改变任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
        // 创建其他类，执行其他类的成员方法只需更改配置文件

        // 1.加载配置文件
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2 加载配置文件，转换为一个集合
        // 1.2.1 获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("cn/hh/domain/pro.properties");
        pro.load(is);

        // 2.获取配置文件中定义的内容
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3. 加载该类进内存
        Class cls = Class.forName(className);

        // 4. 创建对象
        Object obj = cls.newInstance();

        // 5. 获取对象方法
        Method method = cls.getMethod(methodName);

        // 6. 执行方法
        method.invoke(obj);
    }
}
