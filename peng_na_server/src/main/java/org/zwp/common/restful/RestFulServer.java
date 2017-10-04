package org.zwp.common.restful;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
* @Title: RestFulServer restful服务启动类
* @Package org.zwp.common.restful
* @Description:
* @author zwp zwp_java@163.com
* @date 2017/10/4 0004 上午 6:07
* @version V1.0
*/
public class RestFulServer {

    /**
     * @parameters []
     * @method startServer
     * @return void
     * @author zwp zwp_java@163.com
     */
    public static void startServer(){
        Server server=new Server(82);
        ServletHolder servlet = new ServletHolder(ServletContainer.class);
        servlet.setInitParameter("com.sun.jersey.config.property.resourceConfigClass",
                "com.sun.jersey.api.core.PackagesResourceConfig");
        servlet.setInitParameter("com.sun.jersey.config.property.packages",
                "org.zwp.common.restful.service");
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        handler.addServlet(servlet, "/*");
        server.setHandler(handler);
        try {
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Java中的main()方法详解
     */
      public static void main(String args[]) {
            RestFulServer.startServer();
      }
}
