package Servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: huhao
 * @time: 2019/9/17 15:45
 * @desc:
 */
public class ServletDemo2 implements Servlet {
    /**
     * 初始化方法
     * 在Servlet被创建时执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    /**
     * 获取servletConfig对象
     * servletConfig：Servlet的配置信息
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时执行，可执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");
    }

    /**
     * 获取servlet的信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器被正常销毁时执行，只执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroying...");
    }
}
