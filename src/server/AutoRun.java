package server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AutoRun implements ServletContextListener {

	// 当后台被销毁，即发生了tomcat关闭了事件，固定用法
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// 关闭 清空
        ClientManager.shutDown();
	}

	// 当后台被初始化，即发生了tomcat启动了事件，固定用法
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		 // 开启服务器
        ClientManager.startServer();
	}

}
